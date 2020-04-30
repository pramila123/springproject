package com.ncc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncc.spring.dao.StudentDao;

import com.ncc.spring.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDao sdao;
	
	
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public String getStudent(Model model)
	{
		model.addAttribute("smodel",new Student());
		return "student";
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student s)
	{
		sdao.addStudent(s);
		return "redirect:student";
	}


@RequestMapping(value = "/{studentId}/edit")
public String edit(@PathVariable("studentId") int id,Model model)
{
	model.addAttribute("smodel",sdao.getById(id));
	return "editForm";
}
@RequestMapping(value = "/update",method = RequestMethod.POST)
public String updateForm(@ModelAttribute Student s,Model model)
{
	sdao.updateStudent(s);
	model.addAttribute("slist",sdao.getAll());
	return "home";
}

@RequestMapping(value = "/{studentId}/delete")
public String deleteStudent(@PathVariable("studentId") int id,Model model)
{
model.addAttribute("smodel",sdao.getById(id));
sdao.deleteStudent(id);
model.addAttribute("slist",sdao.getAll());
	return "home";
}


}

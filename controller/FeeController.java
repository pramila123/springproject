package com.ncc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncc.spring.dao.FeeDao;
import com.ncc.spring.dao.StudentDao;
import com.ncc.spring.model.Fee;

@Controller
public class FeeController {
	@Autowired
	private FeeDao fdao;
	@Autowired
	private StudentDao sdao;

	@RequestMapping(value = "/fee", method = RequestMethod.GET)
	// @RequestMapping(value = "/{studentId}/addFee")
	public String getFee(Model model) {

		model.addAttribute("fmodel", new Fee());
		return "fee";

	}

	@RequestMapping(value = "/fee", method = RequestMethod.POST)
	public String saveFee(@ModelAttribute Fee f) {
		fdao.addFee(f);
		return "redirect:fee";
	}

	@RequestMapping(value = "/{feeId}/editFee")
	public String editFee(@PathVariable("feeId") int id, Model model) {
		model.addAttribute("fmodel", fdao.getById(id));
		return "editFee";
	}

	@RequestMapping(value = "/updateFee", method = RequestMethod.POST)
	public String updateForm(@ModelAttribute Fee f, Model model) {
		fdao.updateFee(f);
		model.addAttribute("flist", fdao.getAll());
		return "home";
	}
	@RequestMapping(value = "/{feeId}/deleteFee")
	public String deleteFee(@PathVariable("feeId") int id,Model model)
	{
		model.addAttribute("fmodel",fdao.getById(id));
		fdao.deleteFee(id);
		model.addAttribute("flist",fdao.getAll());
		return "home";
	}

}

package com.ncc.spring.dao;

import java.util.List;

import com.ncc.spring.model.Student;

public interface StudentDao {

	public void addStudent(Student s);

	public void deleteStudent(int id);

	public void updateStudent(Student s);

	Student getById(int id);

	public List<Student> getAll();

}

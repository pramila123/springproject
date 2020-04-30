package com.ncc.spring.dao;


import java.util.List;

import javax.annotation.Resource;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ncc.spring.model.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
@Resource
	private SessionFactory sessionFactory;
	@Override
	public void addStudent(Student s) {
		Session sess=sessionFactory.getCurrentSession();
		sess.save(s);
		
	}

	@Override
	public void deleteStudent(int id) {
		Session sess=sessionFactory.getCurrentSession();
		Student s=(Student) sess.get(Student.class, id);
		sess.delete(s);
		
	}

	@Override
	public void updateStudent(Student s) {
		Session sess=sessionFactory.getCurrentSession();
		sess.update(s);
		
	}

	@Override
	public Student getById(int id) {
		Session sess=sessionFactory.getCurrentSession();
		Student s=(Student) sess.get(Student.class, id);
		return s;
	}

	@Override
	public List<Student> getAll() {
		Session sess=sessionFactory.getCurrentSession();
		Criteria crt=sess.createCriteria(Student.class);
		return crt.list();
	}

}

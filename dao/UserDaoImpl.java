package com.ncc.spring.dao;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ncc.spring.model.User;
@Repository
@Transactional
public class UserDaoImpl implements UserDao{
@Resource
	private SessionFactory sessionFactory;
	@Override
	public void signup(User u) {
		Session sess=sessionFactory.getCurrentSession();
		sess.save(u);
		
	}

	@Override
	public User login(String un, String psw) {
		Session sess=sessionFactory.getCurrentSession();
		Criteria crt=sess.createCriteria(User.class);
		crt.add(Restrictions.eq("username", un));
		crt.add(Restrictions.eq("password", psw));
		return (User) crt.uniqueResult();
	}
	

}

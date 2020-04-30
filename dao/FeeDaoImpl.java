package com.ncc.spring.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ncc.spring.model.Fee;

@Repository
@Transactional
public class FeeDaoImpl implements FeeDao {
@Resource
private SessionFactory  sessionFactory;

  
	
@Override
public void addFee(Fee f) {
	Session sess=sessionFactory.getCurrentSession();
	sess.save(f);
}

	@Override
	public void deleteFee(int id) {
		Session sess=sessionFactory.getCurrentSession();
		Fee f=(Fee) sess.get(Fee.class, id);
				sess.delete(f);
	}

	@Override
	public Fee getById(int id) {
		Session sess=sessionFactory.getCurrentSession();
		Fee f=(Fee) sess.get(Fee.class, id);
		return f;
	}

	@Override
	public void updateFee(Fee f) {
		Session sess=sessionFactory.getCurrentSession();
		sess.update(f);
	}

	@Override
	public List<Fee> getAll() {
		Session sess=sessionFactory.getCurrentSession();
		Criteria crt=sess.createCriteria(Fee.class);
		return crt.list();
	}



}

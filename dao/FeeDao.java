package com.ncc.spring.dao;

import java.util.List;

import com.ncc.spring.model.Fee;

public interface FeeDao {
	
	
	public void addFee(Fee f);
	public void deleteFee(int id);
	Fee getById(int id);
	public void updateFee(Fee f);
	public List<Fee> getAll();

}

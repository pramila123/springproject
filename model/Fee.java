package com.ncc.spring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table
public class Fee {
	@Id
	@GeneratedValue
	private int feeId;
	private String feetype;
	private long tuitionfee;
	private long  labfee;
	private long  transportationfee;
	private long  developmentfee;
	private long  libraryfee;
	private long  otherfee;
	private String paymentmode;
	private long discount;
	private long paidamount;
	private String status;
	private long totalAmount;
	private long dueamount;
	@ManyToOne
	@JoinColumn(name = "sfid")
	private Student student;
	
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}
	
	public String getFeetype() {
		return feetype;
	}
	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}
	public long getTuitionfee() {
		return tuitionfee;
	}
	public void setTuitionfee(long tuitionfee) {
		this.tuitionfee = tuitionfee;
	}
	public long getLabfee() {
		return labfee;
	}
	public void setLabfee(long labfee) {
		this.labfee = labfee;
	}
	public long getTransportationfee() {
		return transportationfee;
	}
	public void setTransportationfee(long transportationfee) {
		this.transportationfee = transportationfee;
	}
	public long getDevelopmentfee() {
		return developmentfee;
	}
	public void setDevelopmentfee(long developmentfee) {
		this.developmentfee = developmentfee;
	}
	public long getLibraryfee() {
		return libraryfee;
	}
	public void setLibraryfee(long libraryfee) {
		this.libraryfee = libraryfee;
	}
	public long getOtherfee() {
		return otherfee;
	}
	public void setOtherfee(long otherfee) {
		this.otherfee = otherfee;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public long getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(long paidamount) {
		this.paidamount = paidamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public long getDueamount() {
		return dueamount;
	}
	public void setDueamount(long dueamount) {
		this.dueamount = dueamount;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	


}

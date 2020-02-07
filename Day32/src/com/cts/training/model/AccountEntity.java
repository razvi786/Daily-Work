package com.cts.training.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountEntity {
	
	private int id;
	private long accNo;
	private double balance;
	private String branch;
	private String ifsc;
	private List<Integer> withdrawals;
	
	public AccountEntity() {
		
	}
	
	public AccountEntity(int id, long accNo, double balance, String branch, String ifsc) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.balance = balance;
		this.branch = branch;
		this.ifsc = ifsc;
	}

	public List<Integer> getWithdrawals() {
		return withdrawals;
	}

	public void setWithdrawals(List<Integer> withdrawals) {
		this.withdrawals = withdrawals;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", accNo=" + accNo + ", balance=" + balance + ", branch=" + branch
				+ ", ifsc=" + ifsc + "]";
	}
	
	

}

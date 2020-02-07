package com.cts.training.model;

public class FundTransferEntity {
	
	private int id;
	private long fromAcc;
	private long toAcc;
	private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(long fromAcc) {
		this.fromAcc = fromAcc;
	}
	public long getToAcc() {
		return toAcc;
	}
	public void setToAcc(long toAcc) {
		this.toAcc = toAcc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "FundTransferEntity [id=" + id + ", fromAcc=" + fromAcc+ ", toAcc=" + toAcc + ", amount=" + amount + "]";
	}
	
	

}

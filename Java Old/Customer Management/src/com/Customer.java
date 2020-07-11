package com;

public class Customer
{
	private int custId;
	private String custName;
	private String gender;
	private int age;
	public Customer(int custId, String custName, String gender, int age) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.age = age;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

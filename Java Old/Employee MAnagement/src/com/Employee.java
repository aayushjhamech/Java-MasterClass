package com;

public class Employee 
{
	private String empId;
	private String empName;
	private String gender;
	private int age;
	public Employee(String empId, String empName, String gender, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.age = age;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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

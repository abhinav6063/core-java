package javabasics;

public class Employee {
	private int employeeID;
	private String name;
	private double salary1;
	private String designation;
	private String email;
	private int phone_number;
	private int age;

	public double readSalary() {
		return salary1;
	}

	public String readName() {
		return name;
	}
	
	public String readDesignation() {
		return designation;
	}

	public void setName(String name1) {
		name = name1;
	}

	public void setSalary(double sal1) {
		if(sal1>50000) {
			return;
		}
		salary1 = sal1;
	}
	public void setDesignation(String des1) {
		designation= des1;
	}
	
}

package DataType;

import java.util.ArrayList;

public class Student {

	int rollNo;
	String name;
	float percent10;
	float percent12;
	float percentBtech;
	float income;
	boolean maritalStatus;
	boolean backlog;
	public Student(int rollNo, String name, float percent10, float percent12, float percentBtech, float income,
			boolean maritalStatus, boolean backlog) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percent10 = percent10;
		this.percent12 = percent12;
		this.percentBtech = percentBtech;
		this.income = income;
		this.maritalStatus = maritalStatus;
		this.backlog = backlog;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percent10=" + percent10 + ", percent12=" + percent12
				+ ", percentBtech=" + percentBtech + ", income=" + income + ", maritalStatus=" + maritalStatus
				+ ", backlog=" + backlog + "]";
	}


	public static void main(String[] args) {
		Student S1= new Student(123,"Abhinav",70.2f,70.5f,66.3f,23000.87f,true,false);
		System.out.println(S1);
		
		ArrayList<Integer>  list = new ArrayList<>();
//		list.add(10);
		list.add(Integer.valueOf(10));
		Integer a = Integer.valueOf(10);
		
		System.out.println(Integer.MAX_VALUE);
		
		
	}
}

package Array;

public class ArrayCreation {
	

	public static void main(String[] args) {
		int[] list=new int[10];
		System.out.println(list);
	Student[] list2= new Student[12];
	list2[0]=new Student(123,"Kenny");
	list2[1]=new Student(345,"Lolly");
	
	System.out.println(list2[0] + " " + list2[1]);
}
}

class Student {
	
	int rollNumber;
	String name;
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
}


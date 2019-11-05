package FlowControl;

public class SelectionStatement {
	
	public static void main(String args[]) 
	{
		
	Student s1= new Student(15644,"Shail",59, 61, 2);
	s1.isEligible();
	Student s2= new Student(15645,"Anu",60, 61, 0);
	s2.isEligible();
	}

}
class Student{
	
	int rollNo;
	String name;
	double per10;
	double per12;
	int backlog;

Student(int rollNo, String name, double per10, double per12, int backlog)
{
this.rollNo= rollNo;
this.name= name;
this.per10= per10;
this.per12=per12;
this.backlog=backlog;	
	
}

public void isEligible() {
	
	if (per10>=60 && per12>=60 && backlog==0)
		
	{
	System.out.println("The candidate is eligible for the interview");	
	}
	else
	{
		System.out.println("The candidate isn't eligible for the interview");	
	}
}
}
package javabasics;
import pack2.*;

//import java.io.PrintStream;
import java.lang.String;
import static pack2.Student.name;
import static pack2.Student.getAge;
import static java.lang.System.out;
public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("laddu");
		emp1.setSalary(500000);
		emp1.setDesignation("SSE");

		System.out.println(emp1.readName());
		System.out.println(emp1.readSalary());
//		System.out.println(emp1.readDesignation());
		
		JavaBasics j1= new JavaBasics(10,20);
		System.out.println(JavaBasics.b);
		//System.out.println(j1.b);
		//pack2.Student S1= new pack2.Student();
		Student S2= new Student();
	//java.lang.String name= "Abhinav";
	String f= "hjhhj";
	System.out.println(name);
	//public final static PrintStream out = null;
	System.out.println(getAge());
	out.println("Hello");
	
	}
}

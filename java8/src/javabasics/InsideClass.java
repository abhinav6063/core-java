package javabasics;

public class InsideClass {
int a;
String name;
static Employee emp;
static int b;
{}
static {}

public void m1() {

}
public static void m2() {

}
public int m3() {
	return 11;
}

public Employee m4(String name,int id,String company) {
	return null;
}

public InsideClass() {
	
}

public static void main(String[] args) {
	InsideClass i = new InsideClass();
	int a=i.b;
int result=	InsideClass.b;
System.out.println(result);
System.out.println(a);
InsideClass.m2();
i.m2();
i.m3();


}
}

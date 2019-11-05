package javabasics;

public class ExecutionOrder {
	static {System.out.println("static block 1");}
	static int a=m1();
	static int b;
	{System.out.println("non-static block 1");}
	int c=m3();
	int d;

	
	static {System.out.println("static block 2");}
	
	{System.out.println("non-static block 2");}
	
	static  int m1() {
		System.out.println("this is a static function one");
		return 10;
	};
	
	static  void m2() {
		System.out.println("this is a static function two");
	};
	
	int m3() {
		System.out.println("this is a non- static function one");
		return 30;
	};
	void m4() 
	{
		System.out.println("this is a non- static function two");
	};
	ExecutionOrder() 
	{
		this(10,20);
		System.out.println("this is a constructor with no-arguments");
		
	};
	ExecutionOrder(int a, int b) {
		System.out.println("this is a constructor with arguments");
	};
	
	
	public static void main(String[] args) {
		System.out.println("this is the main method");
		ExecutionOrder o= new ExecutionOrder();
		
		int i = ExecutionOrder.a; 
		System.out.println(i);
		int j=ExecutionOrder.b;
		System.out.println(j);
		ExecutionOrder.m1();
		ExecutionOrder.m2();
		int d= o.c;
		System.out.println(d);
		int e=o.d;
		System.out.println(e);
		int k=o.m3();
		System.out.println(k);
		o.m4();
}
}

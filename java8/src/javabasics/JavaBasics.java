package javabasics;

public class JavaBasics {
// variables
	int a;// instance variable/non-static variable/field
	static int b=20;// static variable/class variable
	int c = 20;

	// method definition
	// <return type><name>(){}
	static int m1() {
		return 10;
	}

	static int m2(int a, int b, String name) {
		return 20;
	}

	static void m3() {
//		a=50;
	}

	static void m4() {
	}

	{
		a = 20;
	}
	static {
		b=20;
//		a=50;
	}

	JavaBasics() {
	}// no argument constructor/default constructor

	JavaBasics(int a, int b) {
		this.a = a;
		this.b = b;

	}

}

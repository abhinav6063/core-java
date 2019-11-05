package operators;

public class IncrementDecremet {
public static void main(String[] args) {
	int a = 10;
	a = a++ +a + a-- -a-- + ++a;
	System.out.println(a);
	byte e=10;
	byte f=20;
	
	int g= e+f; 
	System.out.println(g);
	float k=10;
	double l=20;
	float m= (float) (k+l);
	//System.out.println(10/0);
	System.out.println(-10.0/0);
	System.out.println(10/0.0);
	System.out.println(0.0/0.0);
	//System.out.println(0/0);
	System.out.println(Float.POSITIVE_INFINITY);
	int i= 'A';
	System.out.println(i);
	System.out.println(10+20+'a'+30);
	//String s1=new String("Anu");
	String s2= "Anu";
	//System.out.println(s1==s2);
	//System.out.println(s1.equals(s2));
	String s3= "Kala";
	String s4= "Amit";
	String s5= "Abhinav";
	String s6= "Anu";
	System.out.println(s2==s6);
	
}
}

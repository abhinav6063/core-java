package FlowControl;

import java.util.ArrayList;
import java.util.Iterator;

public class WhileLoop {

	public static void main(String[] args) {

		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*****************");
/*****Enhanced for Loop*****/
		for (int i : list) {
			System.out.println(i);
		}

		int[] array = { 10, 20, 30, 40, 50 };
		for (int b : list)

		{
			System.out.println(b);
		}
		
		String[] s = {"Amit","Alok","Anu","Kala"};
		for(String name:s)
			System.out.println(name);
		
		char[] ch = {'a','b','c','d','e'};
		for(char ch2:ch)
			System.out.println(ch2);
		
		do {
			
			
		} 
		while(true);
		
		
		
	}
}

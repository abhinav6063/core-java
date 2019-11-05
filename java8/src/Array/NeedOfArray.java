package Array;


public class NeedOfArray {
	
	int[] list3= new int [8];
	//list3=new int[8];

	static int a=10;
	static int b=20;
	static int c=30;
	static int d=40;
	static int e=50;
	public static void main (String args[]) {
		int[] list1;//Array declaration
		list1=new int[10];
		int[] list2= new int[12];//declaration and definition
		/*list2[0]=10;
		list2[1]=20;
		list2[2]=30;
		list2[3]=40;
		list2[4]=50;
		list2[5]=60;
		list2[6]=70;
		list2[7]=80;
		list2[8]=90;
		list2[9]=100;
		list2[10]=110;
		list2[11]=120;*/
		int []list4= {10,20,30,40,50,60};
		
		//System.out.println(list4[4]);
		//System.out.println(list4[2]);
		//System.out.println(list4.length);
		//System.out.println(list2.length);
		
		int i;
		for (i=0;i<list4.length;i++)
		{		System.out.println(list4[i]);
	}
		System.out.println();
		for (int j : list4) {
			System.out.println(j);
		}
		}

}

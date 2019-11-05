package Array;

public class QuestionBasedOnArray {
/**
 * Given int[] list={4,8,5,9,3,8,6,1,2,7};
 * Q1.Find max value
 * Q2.Find min value
 * Q3. Find average of the list
 * Q4. Find second largest value
 * Given int[][]a= {{10,20,30},{40,50,60},{70},{80,90}};
 * 
 */
	
	public int getMax(int[] list) {
		int max=list[0];
		for(int i=0;i<list.length ;i++) {
		if (max<list[i]) {
			max=list[i];
		}
		}
		return max;
	}
	
	public int getMin(int[] list) {
		int min=list[0];
		for(int j=0;j<list.length ;j++) {
		if (min>list[j]) {
			min=list[j];
		}
		}
		return min;	
		}
	
	public double getAvg(int[] list) {
		int sum=0;
		for(int k=0;k<list.length ;k++) {
		sum=sum+list[k];
		
		}
		return sum/list.length;	
		}
	
	public static void main(String args[])
	
	{   int[] list={4,8,5,9,3,8,6,1,2,7};
		QuestionBasedOnArray q1= new QuestionBasedOnArray();
		int value= q1.getMax(list);
		System.out.println(value);
		System.out.println();
		int value1= q1.getMin(list);
		System.out.println(value1);
		System.out.println();
		
	}
}

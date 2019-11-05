package Array;

public class TwoDimensionalArray {
	
public static void main(String[] args) {
	int [][]adm= new int[3][2];
	System.out.println(adm);
	System.out.println(adm[0]);
	System.out.println(adm[1][1]);
	System.out.println(adm.length);
	System.out.println(adm[0].length);
	
	for (int i=0;i< adm.length;i++)
	{
		for (int j=0;j<adm[i].length;j++)
		{
			System.out.println(adm[i][j]);
		}
	}
	System.out.println();
for (int[]k:adm)
	for (int l:k)
		System.out.println(l);
int[][]a= {{10,20,30},{40,50,60},{70},{80,90}};
System.out.println(a.length);
System.out.println(a[0].length);
for (int i=0;i< a.length;i++)
{
	for (int j=0;j<a[i].length;j++)
	{
		System.out.println(a[i][j]);
	}
}
}	
}

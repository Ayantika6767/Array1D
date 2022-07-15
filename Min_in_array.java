package Array1;

import java.util.Scanner;

public class Min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size then List of array");
		int n = sc.nextInt();
		int array1[]= new int [n];
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println(find_min(array1));
		
		
	}
		
		public static int find_min(int array2[])
		{	int min= array2[0];
			for(int i=0;i<array2.length;i++)
			{
				
				if(array2[i]<min)
				{
					min=array2[i];
				}
			}
			return min;
		}
	
	
	

}

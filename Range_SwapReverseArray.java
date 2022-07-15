package Array1;

import java.util.Scanner;
public class Range_SwapReverseArray {

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
			System.out.println("Enter range of array to be reversed");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			reverse_rangearray(array1,n1,n2);
			for(int k=0;k<array1.length;k++)
			{
				System.out.print(array1[k]+" ");
			}
			
			
			
		}
			
	public static void reverse_rangearray(int array2[],int n1, int n2)
	{	
		
				for(int p=0;p<array2.length;p++)
				{
					if(n1<n2)
					{
					int temp=array2[n1];
					array2[n1]=array2[n2];
					array2[n2]=temp;
					
					n1++;
					n2--;
					}
				}
				
				
				
			
			}
	
		
		

	}


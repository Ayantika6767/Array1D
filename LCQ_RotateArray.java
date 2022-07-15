package Array1;
import java.util.Scanner;
//LeetCODE  problem but TLE issue=n*k
//This is Brute force approach
public class LCQ_RotateArray {

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
				System.out.println("Enter k steps to rotate array");
				int k=sc.nextInt();
				
				RotateArray(array1,k);
				
				for(int j=0;j<array1.length;j++)
				{
					System.out.print(array1[j]+" ");
				}
				
				
				
			}
				
		public static void RotateArray(int array2[],int k)
		{			k=k% array2.length;
				for(int j=0;j<k;j++)
				{
					int temp=array2[array2.length-1];
					
					for(int i=array2.length-2;i>=0;i--)
					{
						array2[i+1]=array2[i];
					}
					
					array2[0]=temp;
					
				
				}
		}
		
			
			

		}


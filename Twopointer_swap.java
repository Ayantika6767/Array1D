package Array1;
import java.util.Scanner;
public class Twopointer_swap {


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
		
			
			reverse_array(array1);
			
			
		}
			
	public static int reverse_array(int array2[])
	{	
		int i=0,j=(array2.length)-1;
				for(int p=0;p<array2.length;p++)
				{
					if(i<j)
					{
					int temp=array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
					
					i++;
					j--;
					}
				}
				
				for(int k=0;k<array2.length;k++)
				{
					System.out.print(array2[k]+" ");
				}
				
				
				return 1;
			
			}
	
		
		

	}


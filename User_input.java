
package Array1;
import java.util.*;
public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		display(arr);//actual parameter
	}
		
		public static void display(int brr[])//formal parameter
		{	for(int i=0;i<brr.length;i++)
				{
					System.out.print(brr[i]+" ");
				}
			
		}
	}

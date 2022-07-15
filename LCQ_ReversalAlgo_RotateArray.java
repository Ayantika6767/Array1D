package Array1;
import java.util.Scanner;
public class LCQ_ReversalAlgo_RotateArray {

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
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		
	}
	
		
		public static void RotateArray(int array2[],int k)
		{			k=k% array2.length;
					int n=array2.length;
					
					reverse_rangearray(array2,0,n-k-1);
					reverse_rangearray(array2,n-k,array2.length-1);
					reverse_rangearray(array2,0,array2.length-1);
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

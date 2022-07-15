package Array1;
import java.util.Scanner;
public class LCQ_ArrayProduct_exceptself {

	/* 2 4 3 6     given array
	 * 1  2  8  24 left array
	 * 72 18 6  1  right array
	 * 72 36 48 24 product array
	*/ 
	
		
						public static void main(String[] args) {
							// TODO Auto-generated method stub
							
							Scanner sc= new Scanner(System.in);
							System.out.println("Enter array size then List of array");
									int n= sc.nextInt();
									int arr[]=new int[n];
									for(int i=0;i<n;i++)
									{
										arr[i]=sc.nextInt();
									}
									product(arr,n);
									for(int i=0;i<n;i++)
									{
										System.out.print(arr[i]+" ");
									}
						}
						
						public static int[] product(int[]arr2,int n)
						{	
							int right[]=new int[n];
							int left[]=new int[n];
							left[0]=1; right[n-1]=1;
							
							for(int i=1;i<n;i++)
							{
								left[i]=arr2[i-1]*left[i-1];
								
							}
							
							for(int i=n-2;i>=0;i--)
							{
								right[i]=arr2[i+1]*right[i+1];
							}
							
							for(int i=0;i<n;i++)
							{
								arr2[i]=right[i]*left[i];
							}
							
							return arr2;

					}
}




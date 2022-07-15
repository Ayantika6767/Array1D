package Array1;
import java.util.Scanner;
public class LCQ_Max_SubArray_BruteForce {

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
											
												System.out.print(Max_subarray(arr));
											
								}
								
								public static int Max_subarray(int[]arr2)
								{	
									int maxsum=0;
									int n=arr2.length;
									for(int i=0;i<n;i++)
									{	int prevsum=0;
										for(int j=i;j<n;j++)
										{
											prevsum += arr2[j];
											maxsum= Math.max(maxsum, prevsum);
										}
									}
									return maxsum;

							}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////


public static int Max_subarray(int[]arr2)
{	
	int maxsum= Integer.MIN_VALUE;//-2^31
	;
	int prevsum=0;
	int n=arr2.length;
	
	for(int i=0;i<n;i++)
	{	
		prevsum+=arr2[i];
		maxsum= Math.max(prevsum, maxsum);
		if(prevsum<0)
		{
			prevsum=0;
		}
	}
	return maxsum;

}


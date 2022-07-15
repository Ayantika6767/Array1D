package Array1;

import java.util.Scanner;

public class LCQ_RainwaterTrapping {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size then List of array");
				int n= sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				System.out.print(trap(arr));
	}
	public static int trap(int[]arr2)
	{		int n=arr2.length;
			int right[]=new int[n];
			int left[]=new int[n];
			
			left[0]=arr2[0]; right[n-1]=arr2[n-1];
			
			for(int i=1;i<n;i++)
			{
				left[i]=Math.max(left[i-1],arr2[i]);
				
			}
			
			for(int i=n-2;i>=0;i--)
			{
				right[i]=Math.max(arr2[i],right[i+1]);
			}
			
			int ans=0;
			for(int i=0;i<n;i++)
			{
				int min=Math.min(right[i],left[i]);
				ans+=min-arr2[i];
				
			}
			
			return ans;

	}
}
	
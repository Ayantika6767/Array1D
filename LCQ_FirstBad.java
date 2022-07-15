package Array1;
import java.util.Scanner;

public class LCQ_FirstBad {
	/*
	 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

 

Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
	 */

	public static void main(String[] args) {


											Scanner sc= new Scanner(System.in);
											System.out.println("Enter array size then List of array");
													int n= sc.nextInt();
													int arr[]=new int[n];
													for(int i=0;i<n;i++)
													{
														arr[i]=sc.nextInt();
													}
											System.out.println("Enter Bad Version");		
											int element= sc.nextInt();
											
											System.out.println(isbad(arr,element));
													
										}
										
								public static int isbad(int bad)
								{			int ans=0;
											int min=0;
											int max=arr2.length-1;
											
											
								while(min<=max)
									{
										//int mid= (min+max)/2; overflows since int+int = exceeds int range
									int mid = min+ (max-min)/2;
												
										   if(isBadVersion(mid)==true)
										    {
													ans = bad;
													max=mid-1;
											}
											else 
											{
												min=mid+1;
											}
											
												
									}
										return ans;	
											
									}
										
				}



...........................................................................................................

public static int isbad(int bad)
{			int ans=0;
			int min=0;
			int max=n-1;
while(min<=max)
{
	
int mid = min+ (max-min)/2;
			
	   if(mid*mid <= n)
	    {
				ans = mid;
				min=mid+1;
				
		}
		else 
		{
			max=mid-1;
		}
		
			
}
	return ans;	
		
}



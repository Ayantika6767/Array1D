package Array1;
import java.util.Scanner;
public class Binary_Search {

	

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
											System.out.println("Enter element to be searched");		
											int element= sc.nextInt();
											
											System.out.println(search(arr,element));
													
										}
										
								public static int search(int arr2[],int element)
								{	
											int min=0;
											int max=arr2.length-1;
											
											
								while(min<=max)
									{
										int mid= (min+max)/2;
												
										   if(arr2[mid]==element)
										    {
													return mid;
											}
											else if(arr2[mid]<element)
											{
												min=mid+1;
											}
											else
											{
												max=mid-1;
											}
												
									}
										return -1;	
											
									}
										
				}




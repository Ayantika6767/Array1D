package Array1;
import java.util.Scanner;
public class Linear_search {
	
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
			System.out.println("Enter search element");
			int search=sc.nextInt();
			
			System.out.println(find_search(array1,search));
			
			
		}
			
	public static int find_search(int array2[],int search)
			{	int flag=0;
				
				for(int i=0;i<array2.length;i++)
				{
					
					if(array2[i]==search)
					{
						return i;
						
					}
				}
				return -1;
			
			}
	
		
		

	}


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class string
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n= sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("Enter the choice:");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Ascending order:");
				Arrays.sort(arr);
				for(String name : arr)
				{
					System.out.println(name+ " ");
				}
				break;
			case 2:
				System.out.println("Descending order:");
				Arrays.sort(arr,Collections.reverseOrder());
				for(String name : arr)
				{
					System.out.println(name+ " ");
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		
	}
}	 	
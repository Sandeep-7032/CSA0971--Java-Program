import java.util.Scanner;
class skip
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value:");
		int m=sc.nextInt();
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		System.out.println("Enter the K value :");
		int k= sc.nextInt();
		for(int i=m;i<=n;i+=k+1)
		{
			System.out.print(i + " ");
		}
	}
}
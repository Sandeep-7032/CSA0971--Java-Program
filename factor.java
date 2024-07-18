import java.util.Scanner;
class Fact
{
	public static void main(String arg[])
	{
		int n,i,ct=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
				System.out.println(i);
			}
		}
		System.out.println("The number of factors is:"+ct);
	}
}	
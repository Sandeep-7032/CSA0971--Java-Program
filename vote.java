import java.util.Scanner;
class Vote
{
	public static void main(String arg[])
	{
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age :");
		n=sc.nextInt();
		a=18-n;
		if(n>=18)
		{
			System.out.println("Eligible for Vote");
		}else{
			System.out.println("Not Eligible Vote!Eligible After"+a+"years");
		}
	}
}
		
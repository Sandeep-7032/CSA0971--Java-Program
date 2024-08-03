import java.util.Scanner;
class cube
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		double n;
		System.out.println("Enter the decimal number:");
		n=sc.nextDouble();
		double square=n*n;
		double cube= n*n*n;
		System.out.println("The square root of decimal is:"+square);
		System.out.println("The cube root of decimal is:"+cube);
	}
}
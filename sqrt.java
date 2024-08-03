import java.util.Scanner;
class sqrt
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the  number:");
		n=sc.nextInt();
		double s=Math.sqrt(n);
		System.out.println("The positive square root is:"+s+"and negative square root is:"+(-s));
	}
}
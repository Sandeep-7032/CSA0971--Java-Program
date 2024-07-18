import java.util.Scanner;
class Tri
{
	public static void main(String arg[])
	{
		int r,i,j,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		r=sc.nextInt();
		for(i=1;i<=r;i++)
		{
			for(s=1;s<=r-i;s++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
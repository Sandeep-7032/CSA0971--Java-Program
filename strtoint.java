import java.util.Scanner;
class StrtoInt
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int num;
		try
		{
			num=Integer.parseInt(str);
			System.out.println("The string to number is :"+ num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid");
		}
	}
}
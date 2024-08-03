import java.util.Scanner;
class reverse
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		System.out.println("The reversed string is:"+ str1);
	}
}
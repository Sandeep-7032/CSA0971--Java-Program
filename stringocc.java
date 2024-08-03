import java.util.Scanner;
class occu
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String n=sc.nextLine();
		String a=n.toLowerCase();
		System.out.println("The string in lower case is:" + a);
		System.out.println("Enter the character:");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		for(char c:a.toCharArray())
		{
			if(c==ch)
			{
				count++;
			}
		}
		System.out.println("The character "+ ch + " is repeated " + count + " times. ");
	}
}
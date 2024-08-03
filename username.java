import java.util.Scanner;
class username
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String str= sc.nextLine();
		int found=0;
		if(str.length()<6)
		{
			found=1;
		}else{
			for(char c:str.toCharArray())
			{
				if(Character.isLetterOrDigit(c))
				{
					found=1;
					break;
				}
			}
		}	
		if(found==0)
		{	
			System.out.println("Username is valid");
		}else{
			System.out.println("Username is invalid");
		}
	}
}
			
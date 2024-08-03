import java.util.Scanner;
class simp
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		int princi=sc.nextInt();
		System.out.println("Enter the time period:");
		int time=sc.nextInt();
		System.out.println("Is the customer is senior citizen (0 for non-citizen and 1 for citizen): ");
		int custo=sc.nextInt();
		double rate;
		if(custo==1)
		{
			rate=12.0;
		}else{
			rate=10.0;
		}
		double simple = (princi*time*rate)/100;
		System.out.println("The simple intrest is : " + simple);
	}
}
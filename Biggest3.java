import java.util.Scanner;

public class Biggest3 {

	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any three positive numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The largest of the three numbers is :"+a);
		}
		else if(b>c)
		{
			System.out.println("The largest of the three numbers is :"+b);
		}
		else
		{
			System.out.println("The largest of the three numbers is :"+c);

		}
	}
	
}

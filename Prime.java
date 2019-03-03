import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a positive number:");
	int n = s.nextInt();
	int i;
	int flag=0;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;
		}
		
	}
	if(flag==1)
	{
		System.out.println("It is a prime not a number");
	}
	else {
	System.out.println("It is a prime  a number");
}
}
}

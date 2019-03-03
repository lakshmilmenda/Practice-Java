import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = s.nextInt();
	int b=n, count=0;
	while(b>0)
	{
		b=b/10;
		++count;
	}
	int a=n,rem;
	double rev=0;
	while(a>0)
	{
		rem=a%10;
		rev=rev+Math.pow(rem,count);
		a=a/10;
	}
	if(n==rev)
	{
		System.out.println("Its a Armstrong number");
	}
	else {
		System.out.println("Not a Armstrong number");
	}
}
}

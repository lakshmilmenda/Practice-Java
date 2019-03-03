import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a number :");
	int a=s.nextInt();
	int rem,rev=0;
	int n=a;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(a==rev)
	{
		System.out.println(a+" is a palindrome");
	}
	else {
		System.out.println(a+" is not a palindrome");
	}
}
}

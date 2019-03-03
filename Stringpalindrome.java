import java.util.Scanner;

public class Stringpalindrome {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the String:");
	String str = s.next();
	String rev = new StringBuilder(str).reverse().toString();
	if(str.equals(rev))
	{
		System.out.println("It is a palindrome");
	}
	else 
	{
		System.out.println("Its not a Palindrome");
	}
	
	
}

private static Object StringBuffer(String str) {
	// TODO Auto-generated method stub
	return null;
}
}

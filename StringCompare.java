import java.util.Scanner;

public class StringCompare {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter  String1:");
	String a=s.next();
	System.out.println("Enter String2:");
	String b= s.next();
	if(a.equals(b))
	{
		System.out.println("Both the strings are same");
	}
	else
	{
		System.out.println("Different Strings");
	}
}
}

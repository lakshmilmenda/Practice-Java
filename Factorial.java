import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int i;
	long fact=1;
	for(i=1;i<=n;i++)
		fact=fact*i;
System.out.println("the factorial of  "+n+" is : "+fact);
}
}

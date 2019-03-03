import java.util.Scanner;

public class Factorial1 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the range :");
		int a =s.nextInt();
		int b=s.nextInt();
		int i ,fact=1;
		for(i=a;a<=b;a++)
			fact=fact*a;
		System.out.println("The factorial is : "+fact);
	}

}

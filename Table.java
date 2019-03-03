import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		
		System.out.println("The table of  "+n+" is: ");
		int i;
		for(i=1;i<=10;i++)
			System.out.println(n+"*"+i+"="+n*i);
	}
}

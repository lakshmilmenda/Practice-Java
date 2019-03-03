import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the n value:");
	int n = s.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("Enter the n numbers");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("The n numbers are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
}
}

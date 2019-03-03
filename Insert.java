import java.util.Scanner;

public class Insert {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n = s.nextInt();
	int a[]=new int[n+1];
	int i;
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the new element to be added");
	int num=s.nextInt();
	System.out.println("Enter the position:");
	int pos=s.nextInt();
	for(i=n-1;i>=pos;i--)
	{
		a[i+1]=a[i];
	}
	a[pos-1]=num;
	System.out.println("After inserting:");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
}
}

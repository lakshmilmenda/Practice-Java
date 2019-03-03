import java.util.Scanner;

public class DeletePos {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n =s.nextInt();
	int i,pos;
	int a[] = new int[n];
	System.out.println("Enter the elements:");
	for(i=0;i<n;i++)
	{
		 a[i]=s.nextInt();
	}
	System.out.println("Enter the position whose value should be deleted:");
	pos=s.nextInt();
	
	if(pos<=a.length)
	{
		for(i=pos;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		System.out.println("After deletion");
		for(i=0;i<=n-2;i++)
		{
			System.out.println(a[i]);
		}
	}
	else {
		System.out.println("Element not found");
	}
}
}

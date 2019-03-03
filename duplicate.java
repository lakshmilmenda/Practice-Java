import java.util.Scanner;

public class duplicate {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	System.out.println("Enter the elements:");
	int i,j,count=0;
	int a[]= new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	}
	System.out.println("no of dupilcate number: "+count);
}
}

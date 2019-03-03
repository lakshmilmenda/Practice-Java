import java.util.Scanner;

public class delete {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = s.nextInt();
		int a[]=new int[n];
		int i,loc=0,flag=0;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the new element to be deleted");
		int num=s.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				loc=i;
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1)
		{	for(i=loc+1;i<a.length;i++)
			{
				a[i-1]=a[i];
			
			}
		System.out.println("after deletion");
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

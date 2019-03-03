import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n = s.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("Enter the elements in sorted order");
	for( i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the element to be found:");
	int num=s.nextInt();
	int f,m,l;
	f=0;
	l=n-1;
	m=(f+l)/2;
	while(f<=l)
	{
		if(a[m]<num)
		{
			f=m+1;
			}
		else if(a[m]==num)
		{
			System.out.println(" Number Found");
			break;
		}
		else  {
			l=m-1;
			
		}m=(f+l)/2;
	}
	if(f>l)
			System.out.println(" Number Not Found");
}
}

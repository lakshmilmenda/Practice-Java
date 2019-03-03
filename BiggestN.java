import java.util.Scanner;

public class BiggestN {

	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = s.nextInt();
		int i,j,largest=0;
		int a[] = new int[n];
		System.out.println("Enter  N numbers");
		for(i=0;i<n;i++)
		{
		 a[i]=s.nextInt();
			
		}
		//biggest element
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					largest=a[i];
				}
				else {
					largest=a[j];
					
				}
				
			}
		}
		System.out.println("The largest number is :"+largest);
	}
}

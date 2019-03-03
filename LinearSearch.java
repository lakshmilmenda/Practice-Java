import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n = s.nextInt();
	int i,flag=0; 
	int a[]=new int[n];
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter the element to be found: ");
	int num=s.nextInt();
	for(i=0;i<n;i++)
	{
		if(num==a[i])
		{
		 flag=1;
		}
	}

	if(flag==1)
	{
		System.out.println(num+" is present");
}
else {
	System.out.println(num+" is not  present");
}
}
}

import java.util.Scanner;

public class smallest5 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the 5 array elements");
	int a[]=new int[5],i,temp;
	for(i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	//biggest
	for(int j=0;j<5;j++)
	for(i=0;i<4;i++)
	{
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}

		System.out.println("The biggest number is "+a[4]);
		System.out.println("The smallest number is  "+a[0]);
		
}
}
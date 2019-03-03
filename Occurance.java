import java.util.Scanner;

public class Occurance {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.next();
	int count=0,i;
	char a[] = new char[50];
	for(i=0;i<str.length();i++)
	{
		a[i]=str.charAt(i);
	}
	for(i=0;i<str.length();i++)
	{
		for(int j=0;j<str.length();j++)
		{
			if(a[i]==a[j])
			{
				count++;
				
			}
			
		}
		System.out.println(a[i]+" "+count);
		count=0;
	}

}
}
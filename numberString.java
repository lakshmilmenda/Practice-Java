import java.util.Scanner;

public class numberString {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a string:");
	String str  = s.next();
	int i,count=0;
	char a[]=str.toCharArray();
	for(char c:a)
	{
		count++;
	}
	System.out.println("It contains : "+count+" characters");
}
}

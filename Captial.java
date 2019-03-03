import java.util.Scanner;

public class Captial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.nextLine();
	String[]  word=str.split("\\s");
	for(String b : word)
	{
		String c=b.substring(0, 1).toUpperCase();
		System.out.print(c.concat(b.substring(1))+" ");
	}
}
}

import java.util.Scanner;

public class StringRev {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	
	System.out.println("Enter a String");
	StringBuilder a = new StringBuilder(s.next());
	System.out.println("Reverse of  "+a+" is : " +a.reverse());
	
} 
}

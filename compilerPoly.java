
public class compilerPoly {
	public void display(int a)
	{
		System.out.println("Integer type: "+a);
	}
	public void display(String b)
	{
		System.out.println("String type: "+b);
	}
	public void display(int a,String b)
	{
		System.out.println("Integer:  "+a+"  String type: "+b);
	}
	
public static void main(String[] args) {
compilerPoly obj = new compilerPoly();
obj.display(10);
obj.display("Hello");
obj.display(11, "Hi");
}
}

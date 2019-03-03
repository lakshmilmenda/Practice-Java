import java.util.ArrayList;

public class arrlist {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	
	//adding
	list.add("hello");
	list.add("hi");
	list.add(10);
	
	//traversing
	int n = list.size();
	System.out.println("The size of array: "+n);
	
	for(Object o :list)
	{
		System.out.println(o);
	}
	
	//remove
	list.remove(1);
	list.remove("hello");
	System.out.println("After removing :");
	for(Object o:list)
		System.out.println(o);
	
	//adding sublist
ArrayList a = new ArrayList();
a.add(11);
a.add("hola");

list.addAll(a);
System.out.println("After adding sub list");
for(Object o :list)
{
	System.out.println(o);
}
}
}

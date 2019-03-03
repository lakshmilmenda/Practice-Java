
public class Prime1 {
public static void main(String[] args) {
	System.out.println("The prime number between 2 to 100");
	int i , flag=0,j;
	for(i=2;i<=100;i++)
	{
		flag=0;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println(i);
		}
	}

}
}

import java.util.*;
class pr1
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1;
		int b=1;
		int c;
		for(int i=1;i<n;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}
}
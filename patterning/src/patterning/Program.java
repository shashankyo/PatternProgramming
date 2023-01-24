package patterning;

public class Program {
public static void main(String []args)
{
	for(int j=1;j<=5;j++)
	{
		for(int i=1;i<=5;i++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("second operation");
	for(int j=1;j<=5;j++)
	{
		System.out.print("*");
	}
	System.out.println("third operation");

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
//	System.out.println("third operation");
//	for(int i=1;i<=5;i--)
//	{
//		for(int j=5;j>=i;j--)
//		{
//		System.out.print("*");
//		}
//		System.out.println();
//	}
	System.out.println("final");
	for(int i =1; i<=5;i++)
	{
		System.out.print("  ");
	}
	
	for(int i=1;i<=5;i++)
	{
		System.out.print("*");
	}
	
	System.out.println("ulti");

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print("+");
		}
		for( int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("next level");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
			
		}
		System.out.println(" ");
	}
	
	System.out.println("done");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("_");
		}
	
	
	for(int j=1;j<=5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
} 
}
}

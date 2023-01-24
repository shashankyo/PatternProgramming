package patternings;

import java.util.Scanner;

public class Pattern {
public static void main(String []args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the row number");
	int n = scan.nextInt();
	//first half
	for (int i=1; i<=n; i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	// second half
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
}
}

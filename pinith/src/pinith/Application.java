package pinith;

import java.util.Scanner;

public class Application {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =scan.nextInt();
		int arr[][] = new int[n][n];
		
	System.out.println("Enter the elements of the 2D array");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			arr[i][j] = scan.nextInt();
		}
	}
	System.out.println("Matrix is");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
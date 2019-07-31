package homework1;

import java.util.Scanner;

public class triangle {
	
	public static void main(String args[])
	{
		int test = 1;
		while(test == 1) {
		System.out.println("Enter 1 for a Right Facing Triangle.");
		System.out.println("Enter 2 for a Left Facing Triangle.");
		System.out.println("Enter 3 for an Equilateral Triangle.");
		System.out.println("Enter 4 for an Upsidedown Equilateral Triangel.");
		
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		System.out.println("Enter the size of the base of the triangle you would like.");
		int size = in.nextInt();
		switch (choice) {
		case 1:
			rightTriangle(size);
			break;
		case 2:
			leftTriangle(size);
			break;
		case 3:
			equilaterialTriangle(size);
			break;
		case 4:
			upsidedownTriangle(size);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		System.out.println("Enter 1 to restart the program");
		Scanner check = new Scanner(System.in);
		test = check.nextInt();
	}
	}
	
	public static void rightTriangle(int size)
	{
		for(int i=0; i<=size; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void leftTriangle(int size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=2*(size-i); j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void equilaterialTriangle(int size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=size-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void upsidedownTriangle(int size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=size-i; j<size; j++) 
			{
				System.out.print(" ");
			}
			for(int j=size-i; j>0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

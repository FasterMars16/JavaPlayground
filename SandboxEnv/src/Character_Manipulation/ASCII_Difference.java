package Character_Manipulation;

import java.util.Scanner;

public class ASCII_Difference 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		char i1 = in.next().charAt(0);
		char i2 = in.next().charAt(0);
		
		if(i1 - i2 > 0) 
		{
			System.out.println("Second character is smaller");
		}
		else if(i1 - i2 < 0) 
		{
			System.out.println("First character is smaller");
		}
		else if(i1 - i2 == 0) 
		{
			System.out.println("Both are the same characters!");
		}
		
		in.close();
		
	}
}

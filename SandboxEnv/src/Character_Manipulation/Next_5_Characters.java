package Character_Manipulation;

import java.util.Scanner;

public class Next_5_Characters 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		char inp = in.next().charAt(0);
		
		for(int i = 0; i < 5; i++) 
		{
			inp++;
			System.out.println(inp);
		}
	}
}

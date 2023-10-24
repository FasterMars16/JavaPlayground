package character_manipulation;

import java.util.Scanner;
import utilities.Printer;

public class Switch_Case_Operations extends Printer{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		printf("1. for checking if a character is uppercase or lowercase");
		printf("2. for checking if a character is a letter or digit");
		printf("3. for checking the word count of a string");
		
		printf("Please enter your choice");
		
		int inp = in.nextInt();
		
		switch (inp) 
		{
			case 1: 
			{	
				char a = in.next().charAt(0);
				if (Character.isUpperCase(a)) 
				{
					printf("Character is uppercase!");
				}
				else 
				{
					printf("Character is lowercase!");
				}
				break;
			}
			case 2:
			{
				char a = in.next().charAt(0);
				if(Character.isDigit(a))
				{
					printf("Character is a digit");
				}
				else if(Character.isLetter(a)) 
				{
					printf("Character is a letter");
				}
				break;
			}
			case 3:
			{
				int spaceCounter = 0;
				String a = in.nextLine();
				for (int i = 0; i <= a.length(); i++)
				{
					if(a.charAt(i) == 32)
					{
						spaceCounter++;
					}
					System.out.println("Number of words : " + spaceCounter);
				}
			}
			default:
			{
				throw new IllegalArgumentException("Unexpected value: " + inp);
			}
		}
	}
}

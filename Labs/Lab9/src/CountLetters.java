/* Name: Zahra Abdulwahab
 * Overview: The program prompts a user for a single word. Each letter is converted to upper case then it prints the number of occurrences of each letter in the word. If the user enters any characters that are not 
 * letters then the program will inform the user of the error but still run normally using an ArrayIndexOutOfBoundsException. 
 * Input: word
 * Output: the single word and the number of occurrences of each letter (error message only shown if user enters character that is not a letter)
 * Variables: counts, word, i
 */

import java.util.Scanner;

public class CountLetters {
	
	public static void main(String[] args)
	{
		
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
	 
		//get word from user
		System.out.print("\n Enter a single word (letters only): ");
		String word = scan.nextLine();
	 
		//convert to all upper case
		word = word.toUpperCase();
	 
		//count frequency of each letter in string
		for (int i=0; i < word.length(); i++)
		{
			try 
			{
				counts[word.charAt(i)-'A']++;
			} catch (ArrayIndexOutOfBoundsException e) 
			{
				// TODO: handle exception
				System.out.println("You entered a character that is not a letter " + e);
			}
		}
			
	
		//print frequencies
		System.out.println();
		for (int i=0; i < counts.length; i++)
			if (counts [i] != 0)
			System.out.println((char)(i +'A') + ": " + counts[i]);
	 
	 }

}

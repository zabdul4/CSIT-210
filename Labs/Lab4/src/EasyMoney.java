/* Name: Zahra Abdulwahab  
 * Overview: This project prompts the user for a three-digit number and generates a random three--digit number. Then it determines 
 * if the user got the number or had the same numbers but wrong order. Then it tells the user how much money they won, if any. 
 * Input: guess
 * Output: easymoneynumbers and the amount of money the user won 
 * Variables: easymoneynumbers, guess 
 */
import java.util.Scanner; 

public class EasyMoney {

	public static void main(String[] args) {
		// Generate a lottery
		 int easymoneynumbers = (int)(Math.random() * 1000);
		 
		 // Prompt the user to enter a guess
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter your EasyMoney pick (three digits): ");
		 int guess = input.nextInt();
		 
		 // Get digits from EasyMoney
		 int easymoneyDigit1 = easymoneynumbers / 100;
		 int easymoneyDigit2 = (easymoneynumbers % 100) / 10;
		 int easymoneyDigit3 = (easymoneynumbers % 100) % 10;
		 
		 // Get digits from guess
		 int guessDigit1 = guess / 100;
		 int guessDigit2 = (guess % 100) / 10;
		 int guessDigit3 = (guess % 100) % 10;
		
		 System.out.println("The EasyMoney number is " + easymoneynumbers);
		 
		 // Check the guess
		 if (guess == easymoneynumbers)
		   System.out.println("Exact match: you win $900");
		 else if (guessDigit1 == easymoneyDigit2
				 && guessDigit2 == easymoneyDigit3
				 && guessDigit3 == easymoneyDigit1
				 || guessDigit1 == easymoneyDigit3
				 && guessDigit2 == easymoneyDigit1
				 && guessDigit3 == easymoneyDigit2
				 || guessDigit1 == easymoneyDigit1
				 && guessDigit2 == easymoneyDigit3
				 && guessDigit3 == easymoneyDigit2
			     || guessDigit1 == easymoneyDigit2
				 && guessDigit2 == easymoneyDigit1
				 && guessDigit3 == easymoneyDigit3
				 || guessDigit1 == easymoneyDigit3
				 && guessDigit2 == easymoneyDigit2
				 && guessDigit3 == easymoneyDigit1)
		   System.out.println("Match all digits: you win $180");
		 else if (guessDigit1 == easymoneyDigit1
				 || guessDigit1 == easymoneyDigit2
				 || guessDigit1 == easymoneyDigit3
				 || guessDigit2 == easymoneyDigit1
				 || guessDigit2 == easymoneyDigit2
			     || guessDigit2 == easymoneyDigit3
			     || guessDigit3 == easymoneyDigit1
			     || guessDigit3 == easymoneyDigit2
			     || guessDigit3 == easymoneyDigit3) 
		   System.out.println("Match one digit: you win $8");
		 else
		   System.out.println("Sorry, no match");   
	}
}

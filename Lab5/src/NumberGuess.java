/* Name: Zahra Abdulwahab 
 * Overview: This project generates a random number between 345 and 980, inclusive. Then it prompts the user for a guess. 
 * If it is incorrect the user is prompted for a guess again. The user may enter -1 at any time to quit the program. If the 
 * guess is bigger than 980 or less than 345 then it is not a valid guess and the user is prompted again for a guess. The 
 * program will inform the user whether their guess is higher or lower than the number generated. If the user enters the 
 * correct number then the program will inform them they got it correct and will end. 
 * Input: guess
 * Output: Displays "guess is not a valid number," or "guess is higher or lower," or "the answer is correct" on the Console. 
 * Variables: num, guess
 */
import java.util.Random;  
import java.util.Scanner; 

public class NumberGuess 
{

	public static void main(String[] args) 
	{
		Random generator = new Random();
		
		int num; 
		
		num = generator.nextInt(636) + 345;  
		
		int guess;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print ("Enter an integer from 345 to 980 inclusive (-1 to quit): ");
		guess = scan.nextInt(); 
		
		while (guess != -1 && guess != num)
		{
			if (guess < 345 || guess > 980)
				System.out.println(guess + " is not a valid number.");
			else 
				if (guess > num)
					System.out.println("The guess is high"); 
				else 
					System.out.println("The guess is low");  
			
			System.out.print("Enter an integer from 345 to 980 inclusive (-1 to quit): ");
			guess = scan.nextInt(); 
		}
		
		if (guess == num)
		System.out.println("The answer is correct"); 

	}
}

/* Name: Zahra Abdulwahab 
 * Overview: This project prompts the user for their birthday (day, month and two-digit year) and determines whether they
 * were born on a magical date. If they were they are accepted into Hogwarts, if not then they are muggles. 
 * Input: Month, Day, Year
 * Output: Displays a message, either acceptance into Hogwarts or that you are a muggle 
 * Variables: Month, Day, Year 
 */
import java.util.Scanner; 

public class MagicDates 
{

	public static void main(String[] args) 
	{
		int Month, Day, Year; 
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter your birthday:\nMonth: ");
		Month = scan.nextInt(); 
		
		System.out.print("Day: "); 
		Day = scan.nextInt(); 
		
		System.out.print("Two-digit year: "); 
		Year = scan.nextInt(); 
		
		if (Month * Day == Year)
			System.out.print("You were born in a magic date. Hogwarts welcomes you to the "
					+ "School of Witchcraft and Wizardry");
		else 
			System.out.print("You were born in a no-magic date; the muggle world is your home"); 

	}
}

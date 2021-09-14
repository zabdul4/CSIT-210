/*
 * Name: Zahra Abdulwahab 
 * Overview: This project calculates Sumiko's age in five years based on Naoki's current age
 * Input: Naoki's current age
 * Output: Sumiko's age in five years
 * Variables: Naoki's current age, Sumiko's age
 */
import java.util.Scanner; 
public class SumikoAge {

	public static void main(String[] args) 
	{
		int sumikoAge = 0;
		int naokiAge = 0;
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.print("    What is Naoki's current age? ");
		naokiAge = scan.nextInt();
		
		sumikoAge = (naokiAge - 5) * 5 - 3;
		
		System.out.println("If Naoki is " + naokiAge + " then Sumiko must be " + sumikoAge + ".");
	}
}

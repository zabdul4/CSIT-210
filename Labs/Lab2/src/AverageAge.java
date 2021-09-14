/*
 * Name: Zahra Abdulwahab     
 * Overview: This project prompts the user for three ages, then calculates their average and displays it on the console
 * Input: age1, age2, age3 (3 ages) 
 * Output: average of the three ages
 * Variables: age1, age2, age3, average
 */
import java.util.Scanner; 
public class AverageAge 
{

	public static void main(String[] args) 
	{
		int age1, age2, age3; 
		double average; 
		Scanner scan = new Scanner(System.in) ; 
		
		//	get three ages from the user
		System.out.println("   Enter three ages and I will compute their average."); 
		
		//	ask the user for the first age (two instructions)
		System.out.print("   Enter the first age: "); 
		age1 = scan.nextInt(); 
		
		//	ask the user for the second age (two instructions) 
		System.out.print("   Enter the second age: "); 
		age2 = scan.nextInt(); 
		 
		//	ask the user for the third age (two instructions) 
		System.out.print("   Enter the third age: "); 
		age3 = scan.nextInt(); 
		
		//compute the average
		average = (age1 + age2 + age3) / 3.0; 
		
		//print the average (note decimals in the display)
		System.out.println("The average is " + average + "."); 
	}
}

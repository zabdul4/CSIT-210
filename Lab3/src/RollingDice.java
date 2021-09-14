/*
 * Name: Zahra Abdulwahab
 * Overview:This program prompts the user for the number of sides for two dice, then it rolls each die 3 times 
 * and finally it calculates the sum and average of each die's rolls. 
 * Input: The number of side for the two dice
 * Output: The 3 rolls for each die (6 rolls total) and the sum and average of each die's rolls
 * Variables: die1, die2, num1, num2, num3, num4, num5, num6, die1Total, die2Total, die1Average, die2Average
 */
import java.util.Random;  
import java.util.Scanner;
import java.text.DecimalFormat;

public class RollingDice 
{
	public static void main(String[] args) 
	{
		Random generator = new Random(); 
		int num1, num2, num3, num4, num5, num6; 
		
		int die1 = 0; 
		int die2 = 0;
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.print("How many sides does die 1 have? ");
		die1 = scan.nextInt(); 
		
		System.out.print("How many sides does die 2 have? ");
		die2 = scan.nextInt(); 
		
		num1 = generator.nextInt(die1) + 1; 
		System.out.println("Die 1 first roll = " + num1 + ".");
		
		num2 = generator.nextInt(die2) + 1; 
		System.out.println("Die 2 first roll = " + num2 + "."); 
		
		num3 = generator.nextInt(die1) + 1; 
		System.out.println("Die 1 second roll = " + num3 + "."); 
		
		num4 = generator.nextInt(die2) + 1; 
		System.out.println("Die 2 second roll = " + num4 + "."); 
		
		num5 = generator.nextInt(die1) + 1; 
		System.out.println("Die 1 third roll = " + num5 + "."); 
		
		num6 = generator.nextInt(die2) + 1; 
		System.out.println("Die 2 first roll = " + num6 + "."); 

		int die1Total, die2Total; 
		die1Total = num1 + num3 + num5; 
		die2Total = num2 + num4 + num6; 
		
		double die1Average, die2Average; 
		die1Average = die1Total / 3.0;
		die2Average = die2Total / 3.0; 
		DecimalFormat fmt = new DecimalFormat("0.###"); 
		
		System.out.println("Die 1 rolled a total of " + die1Total + " and rolled " + fmt.format(die1Average) 
		+ " on average."); 
		System.out.println("Die 2 rolled a total of " + die2Total + " and rolled " + fmt.format(die2Average) 
		+  " on average."); 
	}
}

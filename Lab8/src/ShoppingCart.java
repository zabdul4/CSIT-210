/* Name: Zahra Abdulwahab 
 * Overview: The program calculates the amount based on the price and quantity then prints out all three. Then it asks the user for the price and quantity of three items then it calculates the amount for each 
 * of those items. Then it displays the price, quantity, and amount for each item on the Console.
 * Input: price, quantity
 * Output: price, quantity, amount
 * Variables: price, quantity, amount
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCart 
{
	static NumberFormat money = NumberFormat.getCurrencyInstance();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double [] price = new double[3];
		int [] quantity = new int[3];
		double [] amount = new double[3]; 
	
		// price list
		price[0] = 5.75;
		price[1] = 2.25;
		price[2] = 7.35;
	
		// quantity list
		quantity [0] = 5;
		quantity[1] = 2;
		quantity[2] = 10; 
		
		calculateAmount(price, quantity, amount);
		
		displayArrays(price, quantity, amount);
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println("");
			System.out.print("Please enter the price for " + (i + 1) +": ");
			price[i] = scan.nextDouble();
			
			System.out.println(""); 
			System.out.print("Please enter the quantity for " + (i + 1) +": ");
			quantity[i] = scan.nextInt(); 
		}
		
		System.out.println("");
		calculateAmount(price, quantity, amount);
		
		displayArrays(price, quantity, amount);
	}
	
	public static void calculateAmount(double[] price, int[] quantity, double[] amount)
	{
		amount[0] = price[0] * quantity[0];
		amount[1] = price[1] * quantity[1];
		amount[2] = price[2] * quantity[2];
	}
	
	public static void displayArrays(double[] price, int[] quantity, double[] amount)
	{
		System.out.println("Price \t Quantity    Amount");
		
		for (int i=0; i < 3; i++)
		{
			System.out.println(money.format(price[i]) + "\t    " + quantity[i] + "\t     " + money.format(amount[i]));
		}
	}

}

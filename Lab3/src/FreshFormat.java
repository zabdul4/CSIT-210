/*
 * Name: Zahra Abdulwahab  
 * Overview: The program prompts the user for the price per pound and the weight(ounces) of the vegetable then
 * it calculates the total Price and displays it on the Console.
 * Input: pricePerPound, weightOunces
 * Output: Unit price, weight and Total price 
 * Variables: pricePerPound, WeightOunces, weight, totalPrice
 */

// ********************************************************
// FreshFormat.java
// Computes the price of a fresh vegetable item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.
// ********************************************************

import java.util.Scanner; 
import java.text.NumberFormat; 
import java.text.DecimalFormat; 

public class FreshFormat
{
	
 // ---------------------------------------------------
 // main reads in the price per pound of a fresh vegetable
 // and number of ounces of and then computes
 // the total price and prints a "label" for the item
 // --------------------------------------------------
	
 public static void main (String[] args)
 {
	 
	 final double OUNCES_PER_POUND = 16.0;
	 double pricePerPound; // price per pound
	 double weightOunces; // weight in ounces
	 double weight; // weight in pounds
	 double totalPrice; // total price for the vegetable

	 Scanner scan = new Scanner(System.in);
	 
	 // Declare money as a NumberFormat object and use the
	 // getCurrencyInstance method to assign it a value
	 NumberFormat money = NumberFormat.getCurrencyInstance();
	 
	 // Declare fmt as a DecimalFormat object and instantiate
	 // it to format numbers with at least one digit to the left of the
	 // decimal and the fractional part rounded to two digits.
	 DecimalFormat fmt = new DecimalFormat("0.##"); 
	 
	 // prompt the user and read in each input
	 System.out.println ("Welcome to the Delicious Fresh Market!!\n ");

	 System.out.print ("Enter the price per pound of your vegetable: ");
	 pricePerPound = scan.nextDouble();
	 
	 System.out.print ("Enter the weight (ounces): ");
	 weightOunces = scan.nextDouble();
	 
	 // Convert ounces to pounds and compute the total price
	 weight = weightOunces / OUNCES_PER_POUND; 
	 totalPrice = weight * pricePerPound; 

	 // Print the label using the formatting objects
	 // fmt for the weight in pounds and money for the prices
	 System.out.println(); 
	 System.out.println("***** Fresh Vegetables *****"); 
	 System.out.println();
	 System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound"); 
	 System.out.println("Weight: " + fmt.format(weight) + " pounds"); 
	 System.out.println();
	 System.out.println("TOTAL: " + money.format(totalPrice)); 
 }
}

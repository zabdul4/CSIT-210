/*
 * Name: Zahra Abdulwahab, Nicholas Arellano, Keilob Berchini, Nicholas Garrett 
 * Overview: The program prompts the user for their last name, number of persons traveling, number of nights 
 * staying and money for expenses they're bringing. Then it calculates the total Price Air Fare, Lodging and 
 * the total cost of the trip. Lastly it converts the money for expenses from dollars to pesos Argentinos and 
 * produces a 9 digit random confirmation code. 
 * Input: LastName, NumberOfPersons, Nights, Money
 * Output: Displays the quantity, price and total of Air Fare, Lodging, and money. It also displays the total of all
 * expenses. Lastly it displays the conversion from dollars to pesos Argentinos and the 9 digit confirmation code.
 * Variables: NumberOfPersons, Nights, ConfirmationCode, LastName, AirFare, Lodging, Money, Pesos, ExchangeFee, 
 * and Total
 */

import java.util.Scanner;  
import java.text.NumberFormat; 
import java.text.DecimalFormat; 
import java.util.Random; 

public class Travel {

	public static void main(String[] args) {
		// Constants 
		final double PLANE_TICKET = 1250.25; 
		final double PRICE_PER_NIGHT = 267.85; 
		final double ONE_DOLLAR = 29.95; 
		
		// Variables 
		Integer NumberOfPersons, Nights, ConfirmationCode; 
		String LastName; 
		Double AirFare, Lodging, Money, Pesos, ExchangeFee, Total;  
		
		// Creating the Scanner and Random objects
		Scanner scan = new Scanner(System.in);
		Random generator = new Random(); 
		
		// Creating the NumberFormat and DecimalFormat objects
		NumberFormat fmt = NumberFormat.getCurrencyInstance();  
		DecimalFormat fmt2 = new DecimalFormat("000000000.#"); 
		
		// Prompts user for last name
		System.out.print("Customer Last Name:	"); 
		LastName = scan.next();      
		
		// Prompts user for number of persons traveling
		System.out.print("Number of persons:      ");
		NumberOfPersons = scan.nextInt(); 
		
		// Prompts user for number of nights staying
		System.out.print("Number of nights:       "); 
		Nights = scan.nextInt(); 
		
		// Prompts user for amount of money for expenses 
		System.out.print("Money for expenses:     "); 
		Money = scan.nextDouble(); 
		
		// Prints name of Travel Agency
		System.out.println(""); 
		System.out.println("\t\t   Sweet Dreams"); 
		System.out.println("\t\t//---//--~--\\\\---\\\\"); 
		
		// Prints customer's last name and a message 
		System.out.println(""); 
		System.out.println("\t" + LastName.toUpperCase() + " Vacation trip to Argentina"); 
		
		// Calculations and confirmation code
		AirFare = NumberOfPersons * PLANE_TICKET; 
		Lodging = Nights * PRICE_PER_NIGHT;
		ExchangeFee = Money * 0.03; 
		Pesos = (Money - ExchangeFee) * ONE_DOLLAR; 
		Total = AirFare + Lodging + Money; 
		ConfirmationCode = generator.nextInt(1000000000); 
		
		// Prints layout and Air Fare Information 
		System.out.println(""); 
		System.out.println("\t    Quantity\t" + "  Price\t" + "\t Total\t"); 
		System.out.println("\t    ~~~~~~~~\t" + "  ~~~~~\t" + "\t ~~~~~\t");
		System.out.println("Air Fare       " + NumberOfPersons + "\t" + fmt.format(PLANE_TICKET) + "      " 
							+ fmt.format(AirFare)); 
		
		// Prints Lodging Information
		System.out.println("Lodging        " + Nights + "\t" + fmt.format(PRICE_PER_NIGHT) + "        " 
				+ fmt.format(Lodging)); 
		
		// Prints money Information 
		System.out.println("Money \t\t\t\t       " + fmt.format(Money));
		System.out.println("\t\t\t\t       =========");  
		
		// Prints Total of everything and the conversion 
		System.out.println("Total\t\t\t\t       " + fmt.format(Total));
		System.out.println(""); 
		System.out.println("Pesos Argentinos for the trip: " + fmt.format(Pesos)); 
		
		// Prints confirmation code
		System.out.println("");
		System.out.println("\t\t    Confirmation code: " + fmt2.format(ConfirmationCode));  
	}
}

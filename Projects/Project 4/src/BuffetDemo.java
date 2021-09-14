/*
 * Name: Zahra Abdulwahab, Nicholas Arellano, Keilob Berchini, Nicholas Garrett 
 * Overview: The program prompts the user to enter info about the buffet and the number of adults and children who are eating, it then calculates the bill.
 * this loops until the user is done putting in info for bills.
 * Input: number of children and adults, the zip code, the name of the buffet
 * Output: a bill outlining the various costs and tax, the buffet name and header.
 * Variables: adult, child, zip, tax, total, subTotal, adultCost, childCost
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class BuffetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat perFmt = NumberFormat.getPercentInstance();
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		
		int adult, child, zip;
		double tax, total, subTotal, adultCost, childCost;
		
		//Ask for name and zip
		System.out.print("   Enter name of Buffet: ");
		String name = scan.nextLine();
		System.out.print("   Enter zip code:       ");
		zip = scan.nextInt();
		
		Buffet buffet1 = new Buffet(name, zip);
		
		System.out.println("");
		
		//Entry for people
		
		System.out.print("   Enter number of adults (-1 to stop).. ");
		adult = scan.nextInt();

		while (adult != -1 )
		{
			System.out.print("   Enter number of children............. " );
			child = scan.nextInt();
			
			System.out.println("");
			System.out.println("");
			
			Bill adultBill = new Bill(adult);
			Bill childBill = new Bill(child);
			
			adultCost = adultBill.calcAdultCost();
			childCost = childBill.calcChildCost();
			subTotal = childCost + adultCost;
			tax = Bill.calcTax(subTotal);	
			total = subTotal + tax;
			
			System.out.println(buffet1.toString());
			System.out.println("");
			System.out.println("\t\t\t  Price    Total");
			adultBill.display();
			childBill.display();
			System.out.println("");
			System.out.println("    Subtotal\t\t          "+fmt.format(subTotal));
			System.out.println("    Tax "+ "("+perFmt.format(Bill.TAXRATE)+")\t\t          " +fmt.format(tax));
			System.out.println("");
			System.out.println("        Total Bill\t          "+fmt.format(total));
			System.out.println("");
			System.out.println("");
			System.out.print("   Enter number of adults (-1 to stop).. ");
			adult = scan.nextInt();
		}
		

	}

}

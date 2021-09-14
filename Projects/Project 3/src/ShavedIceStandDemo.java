import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ShavedIceStandDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, zip;
		int smallQty, medQty, lrgQty;
		double tax, subTotal, total;
	
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name of shaved ice stand:  ");
		name = scan.nextLine();
		System.out.print("Enter the zip code:  " );
		zip = scan.nextLine();
		IceStand iceStand = new IceStand(name, zip);
		System.out.println("");
		
		
		System.out.print("Enter number of small (-1 to quit):    ");
		smallQty = scan.nextInt();
		while(smallQty != -1)
		{
			System.out.print("Enter number of medium:     ");
			medQty = scan.nextInt();
			System.out.print("Enter number of large:      ");
			lrgQty = scan.nextInt();
			System.out.println("");
			System.out.println(iceStand);
			
			Snowball snowballSmall = new Snowball();
			Snowball snowballMed = new Snowball();
			Snowball snowballLrg = new Snowball();
			
			subTotal = snowballSmall.calculatePrice("Small\t", smallQty, 1.25) 
					+ snowballLrg.calculatePrice("Large\t", lrgQty, 3.55) 
					+ snowballMed.calculatePrice("Medium\t", medQty, 2.40);
			
			System.out.println("");
			System.out.println("\t\t      Price      Total");
			System.out.println(snowballSmall);
			System.out.println(snowballMed);
			System.out.println(snowballLrg);
			System.out.println("");
			System.out.println(" Sub-Total\t                 "+fmt.format(subTotal));
			
			tax = subTotal * Snowball.TAX_RATE;
			
			System.out.println(" Tax (6%)\t                  "+fmt.format(tax));
			
			total = tax + subTotal;
			
			System.out.println("     Total Bill\t                 "+fmt.format(total));
			System.out.println("");
			System.out.print("Enter number of small (-1 to quit):    ");
			smallQty = scan.nextInt();
			
		}

	}

}

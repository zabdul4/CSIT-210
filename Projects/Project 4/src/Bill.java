/*
 * Name: Zahra Abdulwahab, Nicholas Arellano, Keilob Berchini, Nicholas Garrett 
 * Overview: creates a bill object used to calculate the adult of child costs of the buffet and then returns and displays them as needed.
 * Input: quantity of meals
 * Output: the meal cost, the amount of tax, the bill information for the child or adult meals.
 * Variables: category, mealQty, mealCost, mealPrice, total
 */
import java.text.NumberFormat;

public class Bill 
{

	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	static final double TAXRATE = .06;
	
	// variables
	private String category;
	private int mealQty;
	private double mealCost;
	private double mealPrice;
	
	// constructor
	public Bill(int mealQty)
	{
		category = null ;
		this.mealQty = mealQty; 
		mealCost = 0; 
		mealPrice = 0; 
	}
	
	// methods
	public double calcAdultCost() 
	{ 
	double discount = 0;
	if (mealQty >= 9)
		discount = 5 ;
	category = "Adults  ";
	mealPrice = 31.50;
	mealCost = mealQty * mealPrice - discount;
	return mealCost;
	} 
	
	public double calcChildCost()
	{ 
	category = "Children";
	mealPrice = 15.00;
	if (mealQty >= 3)
		mealCost = 45.00 ;
	else
	mealCost = mealQty * mealPrice;
	return mealCost;
	} 
	
	static double calcTax(double total) 
	{ 
	total = total * TAXRATE;  
	return total;  
	} 
	
	public void display()
	{
		System.out.println("    "+category + "        " + mealQty + "    " + money.format(mealPrice)
					  + "   " + money.format(mealCost));
		return;
	}
	
	
	
}

import java.text.NumberFormat;

public class Snowball {
	
	//properties
	
	private String size;
	private int quantity;
	private double unitPrice;
	private double totalPrice;
	final static double TAX_RATE = .06;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	//constructor
	
	public Snowball()
	{
		
	}
	
	//methods
	
	public double calculatePrice(String sizeT, int quantityT, double unitPriceT)
	{
		size = sizeT;
		quantity = quantityT;
		unitPrice = unitPriceT;
		totalPrice = quantity * unitPrice;
		return totalPrice;
	}
	
	public String toString()
	{
		String billInfo = " "+size+"\t"+quantity+"     "+money.format(unitPrice)+"\t "
		+money.format( totalPrice);
		return billInfo;
	}
	
	static double calculateTax(double billTotal)
	{
		double tax = billTotal * TAX_RATE;
		return tax;
	}
}

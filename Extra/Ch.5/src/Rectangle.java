
public class Rectangle {

	// Define the properties 
	
	private double length; 
	private double width;  
	private static String color = "blue"; // static means all the objects are going to have the same value  
	
	public static void setColor(String colorT)
	{
		color = colorT; 
	}
	//Constructor
	public Rectangle()
	{
		length = 1; 
		width = 1; 
	}
	
	public Rectangle(double length, double width)
	{
		this.length = length; 
		this.width = width; 
	}
	
	// Define the methods
	
	//public / return type / name / parameter list
	//Mutators or setters
	
	public void setLength(double lengthT)
	{
		length = lengthT;
	}
	
	public void setWidth(double widthT)
	{
		width = widthT; 
	}
	
	//Accessors or Getters
	
	public double getLength()
	{
		return length; 
	}

	public double getWidth()
	{
		return width; 
	}
	
	//Add more methods 
	public double getArea()
	{
		return length * width; 
	}
	
	public double getPerimeter()
	{
		double per = 2 * length + 2 * width;
		return per; 
	}
	
	public String toString()
	{
		String text = "This rectangle has a length of " + length + " and a width of " + width; 
		return text; 
	}
}

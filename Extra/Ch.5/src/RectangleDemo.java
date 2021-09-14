
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor 
		
		Rectangle rec1 = new Rectangle();
		
		rec1.setLength(3);
		rec1.setWidth(4);
		Rectangle.setColor("red"); 
		
		//Display the values 
		//System.out.println("The rectangle has a length of " + rec1.getLength() + " and a width of " + rec1.getWidth());
		System.out.println(rec1); 
		
		System.out.println("This rectangle has an area of " + rec1.getArea() + " and a parameter of " + rec1.getPerimeter()); 
		
		//Create a second object using the constructor with parameters 
		
		Rectangle rec2 = new Rectangle(3.5, 6.7); 
		
		//Display the values 
		System.out.println("The rectangle has a length of " + rec2.getLength() + " and a width of " + rec2.getWidth());
		System.out.println("This rectangle has an area of " + rec2.getArea() + " and a parameter of " + rec2.getPerimeter()); 
	}
	
	public int mystery()
	{
		return 3; 
	}
	
	public int mystery(int value)
	{
		return value; 
	}

}


/* Name: Zahra Abdulwahab
 * Overview: This program displays the length, width of two rectangles as well as their area and perimeter on the Console.
 * Input: N/A
 * Output: The length, width, area and perimeter of the first and second rectangles. 
 * Variables: N/A 
 */ 
public class RectangleDemo {

	public static void main(String[] args) {
		
		// Object 1
		Rectangle rec1 = new Rectangle();
		
		rec1.setLength(5);
		rec1.setWidth(7);
		
		// Display the values of rectangle 1
		System.out.println("The first rectangle has a length of " + rec1.getLength() + " and a width of " + rec1.getWidth() + ".");
		
		System.out.println("The first rectangle has an area of " + rec1.getArea() + " and a parameter of " + rec1.getPerimeter() + ".");
		
		// Object 2
		Rectangle rec2 = new Rectangle(5.5, 8.9);
			
		// Display the values of rectangle 1
		System.out.println("The second rectangle has a length of " + rec2.getLength() + " and a width of " + rec2.getWidth() + ".");
		
		System.out.println("The second rectangle has an area of " + rec2.getArea() + " and a parameter of " + rec2.getPerimeter() + ".");

	}

}

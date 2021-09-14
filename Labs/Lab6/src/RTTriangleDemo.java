/* Name: Zahra Abdulwahab    
 * Overview: This program displays the base, height and hypotenuse of two right triangles, as well as the area perimeter on the Console.
 * Input: tri1.setBase, tri1.setHeight, base and height
 * Output: The base, height, hypotenuse, area and perimeter of two right triangles. 
 * Variables: base and height 
 */

import java.util.Scanner;

public class RTTriangleDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// First triangle
		RTTriangle tri1 = new RTTriangle(); 
		
		System.out.print("Enter the base of the first triangle: ");
		tri1.setBase(scan.nextInt());
		
		System.out.print("Enter the height of the first triangle: ");
		tri1.setHeight(scan.nextInt());
		
		System.out.println("");
		
		// Display the values of triangle 1
		System.out.println("The first triangle has a height of " + tri1.getHeight() + ", a base of " + tri1.getBase() + " and a hypotenuse of " + tri1.getHypotenuse() + ".");
		
		System.out.println("The first triangle has an area of " + tri1.getArea() + " and a parameter of " + tri1.getperimeter() + ".");
		
		System.out.println("");
		
		// Second Triangle 
		double base, height;
		
		System.out.print("Enter the base of the second triangle: ");
		base = scan.nextDouble();
		
		System.out.print("Enter the height of the second triangle: ");
		height = scan.nextDouble();
		
		RTTriangle tri2 = new RTTriangle(base, height);
		
		System.out.println("");
		
		// Display the values of triangle 2
		System.out.println("The second triangle has a height of " + tri2.getHeight() + ", a base of " + tri2.getBase() + " and a hypotenuse of " + tri2.getHypotenuse() + ".");
				
		System.out.println("The second triangle has an area of " + tri2.getArea() + " and a parameter of " + tri2.getperimeter() + ".");
				
		
		
		
		
		
		
		
		
		
		
	}
}

/* Name: Zahra Abdulwahab
 * Overview: This program displays the perimeter and area of three polygons on the Console. It prompts the user for the sides and side length of the second polygon then calculates the area and perimeter. The program
 * then prompts the user for the sides, side length, x-coordinate, and y-coordinate of the third polygon. Then it calculates the perimeter and the area. 
 * Input: sides, sideLength, xCoordinate, yCoordinate
 * Output: The perimeter and area of the three polygons
 * Variables: sides, sideLength, xCoordinate, yCoordinate
 */

import java.util.Scanner;

public class PolygonFunDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// First object
		PolygonFun gon1 = new PolygonFun();
		
		gon1.setSideLength(10);
		gon1.setSides(5);
		gon1.setXCoordinate(5);
		gon1.setYCoordinate(9);
		
		// Display the values of the first object
		System.out.println("The first polygon has a perimeter of " + gon1.getPerimeter() + " and the area is " + gon1.getArea());
		
		
		// Second object
		int sides;
		double sideLength;
		
		System.out.print("Enter the number of sides of the second polygon: ");
		sides = scan.nextInt();
		
		System.out.print("Enter the length of the sides of the second polygon: ");
		sideLength = scan.nextDouble();
		
		PolygonFun gon2 = new PolygonFun(sides, sideLength);
		
		gon2.setXCoordinate(10);
		gon2.setYCoordinate(4);
		
		// Display the values of the second object
		System.out.println("The first polygon has a perimeter of " + gon2.getPerimeter() + " and the area is " + gon2.getArea());

		
		// Third object
		double xCoordinate;
		double yCoordinate; 
		
		System.out.print("Enter the number of sides of the third polygon: ");
		sides = scan.nextInt();
		
		System.out.print("Enter the length of the sides of the third polygon: ");
		sideLength = scan.nextDouble();
		
		System.out.print("Enter the x-coordinate of the third polygon: ");
		xCoordinate = scan.nextDouble();
		
		System.out.print("Enter the y-coordinate of the third polygon: ");
		yCoordinate = scan.nextDouble();

		PolygonFun gon3 = new PolygonFun(sides, sideLength, xCoordinate, yCoordinate);
		
		// Display the values of the third object
		System.out.println("The first polygon has a perimeter of " + gon3.getPerimeter() + " and the area is " + gon3.getArea());
	}

}

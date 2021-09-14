/* Name: Zahra Abdulwahab
 * Overview: The program asks the user for the amount of rows and columns. Then it asks the user for the specific numbers in each row and column. After that it displays the table with the values that the user entered.
 * Then it calculates the total for each row and column, as well as the total for the matrix. It displays all of these values on the Console.
 * Input: rows, columns, row, col
 * Output: table, total
 * Variables: rows, columns, table, row, col, total
 */

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int rows; 
		int columns; 
		
		System.out.println("How big would you like your matrix?");
		System.out.print("Rows - ");
		rows = scan.nextInt();
		System.out.print("Columns - ");
		columns = scan.nextInt();
		System.out.println("");
		
		int[][] table = new int[rows][columns];
		
		for (int row = 0; row < rows; row++)
		{
			System.out.println("Please enter your row " + (row + 1) + " ?");
			
			for (int col = 0; col < columns; col++)
			{
				System.out.print("Column " + (col + 1) + " - ");
				table[row][col] = scan.nextInt();
			}
			
			System.out.println("");
		}
		
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < columns; col++)
			{
				System.out.print(table[row][col] + "   ");
			}
			System.out.println("");
		}
		
		System.out.println(""); 
		
		for (int row = 0, total = 0; row < rows; row++)
		{
			for (int col = 0; col < columns; col++)
			{
				total = total + (table[row][col]);
			}
			
			System.out.println("Your total for row " + (row + 1) + " is - " + total);
			total = 0;
		}
		
		System.out.println("");
		
		for (int col = 0, total = 0; col < columns; col++)
		{
			for (int row = 0; row < rows; row++)
			{
				total = total + (table[row][col]);
			}
			
			System.out.println("Your total for column " + (col + 1) + " is - " + total);
			total = 0;
		}
	
		System.out.println("");
		
		int sum = 0;
		
		for (int col = 0; col < columns; col++)
		{
			for (int row = 0; row < rows; row++)
			{
				sum = sum + (table[row][col]);
			}	
			
		}			
		
		System.out.println("Your total for the " + rows + " x " + columns + " matrix is " + sum);
	}
}

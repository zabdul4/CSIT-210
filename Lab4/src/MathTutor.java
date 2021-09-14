/* Name: Zahra Abdulwahab 
 * Overview: This project prompts the user for two numbers and an arithmetic operator. Then it performs the operation and 
 * displays the answer on the console. 
 * Input: num1, num2, operator  
 * Output: answer
 * Variables: num1, num2, answer, operator  
 */
import java.util.Scanner; 

public class MathTutor 
{ 
	public static void main(String[] args) 
	{
	
		double num1, num2, answer; 
		String operator; 
	
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter the first number: ");
		num1 = scan.nextDouble();
		
		System.out.print("Enter the second number: ");
		num2 = scan.nextDouble(); 
		
		System.out.print("Enter the operator: "); 
		operator = scan.next(); 

		switch (operator)
		{
		case "+":
			answer = num1 + num2; 
			System.out.print(answer);
			break; 
		case "-":
			answer = num1 - num2; 
			System.out.print(answer);
			break; 
		case "*":
			answer = num1 * num2; 
			System.out.print(answer);
			break; 
		case "/":
			answer = num1 / num2; 
			System.out.print(answer);
			break; 
		default:
			System.out.print("non-valid operator");
			break; 
		}
	}
}

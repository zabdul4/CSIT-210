/* Name: Zahra Abdulwahab
 * Overview: This program identifies the perfect numbers (a number equal to the sum of its divisors) between 1 and 10,000. 
 * Input: N/A
 * Output: The perfect numbers (num) 
 * Variables: num, div, sum 
 */
public class JustPerfects 
{

	public static void main(String[] args) 
	{
		int num, div, sum;
		
		for (num = 1; num <= 10000; num++)
		{
			for (div = 1, sum = 0; div < num; div++) // div = divisor 
			{
				if(num % div == 0)
				{
					sum = sum + div; 
				}
			}
			if (sum == num)
				System.out.println(num + " is a perfect number."); 	
		}
		
		// Bonus: How many perfect numbers exist between 10,000 and 35,000?
		
		for (num = 10000; num <= 35000; num++)
		{
			for (div = 10000, sum = 0; div < num; div++) // div = divisor 
			{
				if(num % div == 0)
				{
					sum = sum + div; 
				}
			}
			if (sum == num)
				System.out.println(num + " is a perfect number."); 	
		}
		
		System.out.println("No perfect numbers exist between 10,000 and 35,000."); 
		
		// No perfect numbers exist between 10,000 and 35,000. 
	}
}

/* Name: Zahra Abdulwahab
 * Overview: This program displays the id number and balance of two accounts on the Console. The program prompts the user for the id number, balance, withdrawal amount and deposit amount of the second account. 
 * The program then calculates the balance that is left on the second accountafter the user enters the withdrawal and deposit amount. It then deisplays the id number and remaining balance of the second account on the 
 * Console. 
 * Input: id, balance, withdraw, deposit
 * Output: The id number and balance of both accounts 
 * Variables: id, balance, withdraw, deposit
 */

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		// First object
		Account acc1 = new Account();
		
		acc1.idMutator(1234);
		acc1.balanceMutator(4321);
		acc1.interestRateMutator(.032);
		
		acc1.withdraw(3210);
		acc1.deposit(2345); 
		
		System.out.println(acc1); 

		
		// Second object
		Scanner scan = new Scanner(System.in);
		long id;
		double balance;
		double withdraw;
		double deposit;
		
		System.out.print("Enter the id: ");
		id = scan.nextLong();
		
		System.out.print("Enter the balance: ");
		balance = scan.nextDouble();
		
		Account acc2 = new Account(id, balance);
		
		System.out.print("Enter the withdraw amount: ");
		withdraw = scan.nextDouble();
		acc2.withdraw(withdraw);
		System.out.println(acc2); 
		
		System.out.print("Enter the deposit amount: ");
		deposit = scan.nextDouble();
		acc2.deposit(deposit);
		System.out.println(acc2); 
	}

}

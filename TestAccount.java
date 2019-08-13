package AssignmentSession4;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Savings sav = new Savings(1, "Sarah", "4900", 3.3);
		Current cur = new Current(2, "Mike", "2100", 4.0);
		
		System.out.println("Enter your savings account information with your Account Number, Name, Balance, and Rate of Interest respectively: ");
		sav.setAcctNum(input.nextInt());
		sav.setAcctName(input.next());
		sav.setAcctBalance(input.next());
		sav.setRateOfInterest(input.nextDouble());
		
		
		System.out.println("Your Savings account is as follows: ");
		System.out.println("Your account number is: " + sav.getAcctNum());
		System.out.println("Your account name is: " + sav.getAcctName());
		System.out.println("Your account balance is: " + sav.getAcctBalance());
		System.out.println("Your account rate of interest is: " + sav.getRateOfInterest());
		
		
		System.out.println("Now enter the information for your 'Current' account with your Account Number, Name, Balance, and Rate of Interest respectively: ");
		
		cur.setAcctNum(input.nextInt());
		cur.setAcctName(input.next());
		cur.setAcctBalance(input.next());
		cur.setRateOfInterest(input.nextDouble());
		
		System.out.println("Your Current account is as follows: ");
		System.out.println("Your account number is: " + cur.getAcctNum());
		System.out.println("Your account name is: " + cur.getAcctName());
		System.out.println("Your account balance is: " + cur.getAcctBalance());
		System.out.println("Your account rate of interest is: " + cur.getRateOfInterest());

		
	}

}

package Questions;

import java.util.Scanner;

public class ATM_Program {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter amount");
		 int amount =sc.nextInt();
		 int amount1 = amount; 
		System.out.println("Welcome to ATM_Program");
		System.out.println("Choose ATM service from Below Operations");
		System.out.println("1. Withdraw Money");
		System.out.println("2. Check Balance");
		System.out.println("3. Deposit Money");
		System.out.println("Enter Service Number");
		int sn =sc.nextInt();
		switch(sn) {
		case 1: 
			withdrawMoney(amount);
			break;
		case 2:
		    checkBalance(amount);
		    break;
		case 3:
			depositMoney(amount);
			break;
		default:
			System.out.println("Thanks!! for Choosing Options");
		}
		

	}

	public static void depositMoney(int amount) {
		System.out.println("Enter Amount You wish to deposit");
		Scanner sc =new Scanner(System.in);
		int addAmount = sc.nextInt();
		int UpdatedAmount = amount+ addAmount;
		System.out.println("Amount Deposit Suucesfully & updated account Balance is "+UpdatedAmount +" Rs");
		
		
	}

	private static void checkBalance(int amount) {
		
		System.out.println(" Your account Balance is "+amount+"Rs");
		
	}

	public static void withdrawMoney(int amount) {
		System.out.println("Enter Amount you wish to withdraw");
		Scanner sc =new Scanner(System.in);
		int withdrawingAmount =sc.nextInt();
		if(withdrawingAmount<amount)
		{
			int updatedAmount =amount-withdrawingAmount;
			System.out.println(withdrawingAmount+" Amount withdrawn Suucesfully & updated account Balance is "+updatedAmount+"Rs");
		}
		else
			System.out.println("Withdrwaing amount is more than existing amount");
	}

}

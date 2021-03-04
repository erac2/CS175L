import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		//Declarations of variables for Bank Account
		
		double withDrawAmount;
		double depositAmount;
		double interestPct;
		double startBal;
		String YesOrNo;
		double accountBal;
		
		
		//Program begins to start by asking for starting balance for Bank Account
		
		System.out.println("Please enter your starting balance: ");
		startBal = in.nextDouble();
	
		//Program asks for interest amount in order to begin the calculation towards the Bank Account
		//Example: 5% interest amount
		
		System.out.println("Enter the interest rate for this account: ");
		interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		//Program asks person to input amount they want to deposit into the account
		
		System.out.println("How much do you want to deposit: ");
		depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		//Program asks person to input how much they want withdraw from Bank Account
		
		System.out.println("How much do you want to withdraw: ");
		withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		System.out.println("How much do you want to withdraw: ");
		withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		//If the amount is greater than or equal to 3000, program will print out, 
		//"Insufficient Funds to support the withdrawal" and program will ask once again, to input the
		//proper withdraw amount.
		
		//Program will ask person for amount to withdraw from Bank Account.
				
		//Program will ask person if they want to generate interest to their Bank Account. If they answer Yes, program
		//will move ahead and calculate the interest towards the account, but however, will ask the question again
		//if the person answers No.
		
		System.out.println("If you want to generate interest, enter 'Yes': ");
		YesOrNo = in.next();
		
		if (YesOrNo.equals("Yes"))
		{
			myBankAccount.calcInterest();
		}
			
		accountBal = myBankAccount.getBalance();
		System.out.println("The account balance is: " + accountBal);
		
		

	}

}

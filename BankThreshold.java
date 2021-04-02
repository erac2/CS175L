import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		double startBal;
		double interestPct;
		
		System.out.println("Please enter your starting balance: ");
		startBal = in.nextDouble();
		
		System.out.println("Enter the interest rate for this account: ");
		interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		System.out.println("Enter a threshold for your account balance to reach or to 'End': ");
		int numberOfMonths = 0;

		while (in.hasNextDouble())
		{
			double numb = in.nextDouble();
			while(myBankAccount.getBalance() < numb)
			{
				myBankAccount.calcInterest();
				numberOfMonths++;
			}
			System.out.println("It will take "+numberOfMonths+ " months to reach the threshold: " + numb);
			System.out.println("Enter a threshold for your account balance to reach or to 'End': ");
		}
		
		

	}

}

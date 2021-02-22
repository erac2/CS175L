import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double withDrawAmount;
		double depositAmount;
		
		System.out.println("Please enter your starting balance: ");
		double startBal = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.println("How much do you want to withdraw: ");
		withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		System.out.println("How much do you want to deposit: ");
		depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println(myBankAccount.getBalance());
		
		

	}

}

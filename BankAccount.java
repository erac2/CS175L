/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestPct;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double amount1, double amount2)
   {
      balance = amount1;
      interestPct = amount2;    
	System.out.println("	Created new account with " + amount1 + " balance and interest rate " + amount2);

   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("		Deposited: " + amount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double withDrawAmount)
   {
	   
   if (balance < withDrawAmount)
	{
		System.out.println("Insufficient Funds to support the withdrawal");
	}
	else
	{
		balance = balance - withDrawAmount;
		System.out.println("	Withdrew: " + withDrawAmount);
	}
   
   }
   public void calcInterest()
   
   {
	   double intCalc = interestPct * balance;
	   balance = balance + intCalc;
	   System.out.println("		Interest: " + intCalc);
   }
   
  //    Gets the current balance of this bank account.
   //   @return the current balance
   
   public double getBalance()
   {
      return balance;
   }
}
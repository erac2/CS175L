import java.util.ArrayList;
public class BankAccountTester2 {
	public static void main(String[] args) {

		// Creating Objects of Employee class
		BankAccount Gill = new BankAccount( "Gill", 500);
		BankAccount Joe = new BankAccount("Joe", 1000);
		BankAccount Fred = new BankAccount("Fred", 2000);
		BankAccount Sally = new BankAccount("Sally", 2500);

		// Creating an ArrayList of Employee type
		ArrayList<BankAccount> employeeList= new ArrayList<>();
		
		//BankAccount employee = new BankAccount();
		// Inserting the employee objects in the ArrayList
		employeeList.add(Gill);
		employeeList.add(Joe);
		employeeList.add(Fred);
		
		for(BankAccount employee : employeeList)
		{	
				System.out.println(employee.getAccount());
		}
		
		if(!employeeList.contains(Sally))
		{System.out.println("adding Sally");employeeList.add(Sally);}
		// e1 will be inserted again as ArrayList can store multiple
		// reference to the same object
		//employeeList.add(Sally);
		//employeeList.removeAll(Collection:e1);/
		//employeeList.remove(e2);
		for(BankAccount employee: employeeList)
		{
			System.out.println(employee.getAccount());
		}
			// Checking if e2 already exists inside ArrayList
		// if it exists then we don't insert it again
		if(employeeList.contains(Sally))
			{System.out.println("removing Sally");employeeList.remove(Sally);}

		// ArrayList after insertions: [e1, e2, e3, e1]

		// Iterating the ArrayList with the help of Enhanced for loop
		for(BankAccount employee: employeeList)
		{
			System.out.println(employee.getAccount());
		}
	}
}

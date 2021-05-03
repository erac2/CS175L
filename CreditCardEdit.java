import java.util.Scanner;
public class CreditCardEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String creditCardNumb;
		int i;
		char character;
		String numb;
		i = 0;
		
		System.out.println("Enter your Credit Card Number, or enter -99 to stop: ");
		
		while (in.hasNextLine())
		{
			creditCardNumb = in.nextLine();
			if (creditCardNumb.equals("-99"))
			{
				System.out.println("Thats all!");
				break;
			}
		
		while (i<creditCardNumb.length())
			{
			character = creditCardNumb.charAt(i);
			if (character == ' ' || character == '-')
			{
				String before = creditCardNumb.substring(0, i);
				String after = creditCardNumb.substring(i+1);
				creditCardNumb = before + after;
			}
			else {
				i++;
			}
				
				/*	creditCardNumb = creditCardNumb.replace(" ", "");
		
			
			}
			else if (character == '-')
			{
				creditCardNumb = creditCardNumb.replace("-", "");
			}
			}*/
			}
			System.out.print(creditCardNumb);
			System.out.println("");
			System.out.println("Enter your Credit Card Number, or enter -99 to stop: ");
		
	}
}
}
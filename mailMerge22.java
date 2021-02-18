package mailMerge;
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args)
{
		Scanner eric = new Scanner(System.in);
		// TODO Auto-generated method stub
		String firstName = "";
		String lastName = "";
		String houseNumber = "";
		String street = "";
		String yORn = "";

		String replaceText1 = "Dear <firstName> <lastName>";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		String promptText6 = "Your answer is: Yes Goodbye!";
		
		System.out.println(promptText1);
		firstName = eric.nextLine();
		System.out.println(promptText2);
		lastName = eric.nextLine();
		System.out.println(promptText3);
		houseNumber = eric.nextLine();
		System.out.println(promptText4);
		street = eric.nextLine();		
				
		replaceText1 = replaceText1.replace("<firstName>", firstName);
		replaceText1 = replaceText1.replace("<lastName>", lastName);
		replaceText2 = replaceText2.replace("<houseNumber>", houseNumber);
		replaceText2 = replaceText2.replace("<street>", street);
		replaceText3 = replaceText3.replace("<yORn>", yORn);
		
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		System.out.println(promptText5);
		yORn = eric.nextLine();
		System.out.println(promptText6);
	}

}

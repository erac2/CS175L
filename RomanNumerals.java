import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		//Declare the variables within the program
		
		int roman;
		int integers;
		int first;
		int sec;
		int third;
		int fourth;
		
		//String 1 = "I";
		
		//This next section will collect the data from the person and attempt to
		//convert them into Roman numerals.
		
		System.out.println("What integers would you like to convert? ");
		integers = in.nextInt();
		
		//This section will separate the numbers into different sections.
		
		first = integers/1000%10;
		System.out.println(first);
		
		sec = integers/100%10;
		System.out.println(sec);
		
		third = integers/10%10;
		System.out.println(third);
		
		fourth = integers/1%10;
		System.out.println(fourth);
		
		//This next section will multiply the single integers by the
		//year formats. Example: The first number will be multiplied by 1000, second by 100.
		
	/*	first = first*1000;
		sec = sec*100;
		third = third*10;
		fourth = fourth*1;
		*/
		
		if (first == 1)
		{
			System.out.print("M ");
		}
		else if (first==2)
		{
			System.out.print("MM ");
		}
		
		//The second section for the 
		
		if (sec == 9)
		{
			System.out.print("CM ");
		}
		else if (sec == 8)
		{
			System.out.print("DCCC ");
		}
		else if (sec == 7)
		{
			System.out.print("DCC ");
		}
		else if (sec == 6)
		{
			System.out.print("DC ");
		}
		else if (sec == 5)
		{
			System.out.print("D ");
		}
		else if (sec == 4)
		{
			System.out.print("CD ");
		}
		else if (sec == 3)
		{
			System.out.print("CCC ");
		}
		else if (sec == 2)
		{
			System.out.print("CC ");
		}
		else if (sec == 1)
		{
			System.out.print("C ");
		}
		else if (sec == 0)
		{
			System.out.print(" ");
		}
		
		//The third section.
		
		if (third == 9)
		{
			System.out.print("XC ");
		}
		else if (third == 8)
		{
			System.out.print("LXXX ");
		}
		else if (third == 7)
		{
			System.out.print("LXX ");
		}
		else if (third == 6)
		{
			System.out.print("LX ");
		}
		else if (third == 5)
		{
			System.out.print("L ");
		}
		else if (third == 4)
		{
			System.out.print("XL ");
		}
		else if (third == 3)
		{
			System.out.print("XXX ");
		}
		else if (third == 2)
		{
			System.out.print("XX ");
		}
		else if (third == 1)
		{
			System.out.print("X ");
		}
		else if (third == 0)
		{
			System.out.print(" ");
		}
		
		//The fourth and last section.
		
		if (fourth == 9)
		{
			System.out.print("IX ");
		}
		else if (fourth == 8)
		{
			System.out.print("VIII");
		}
		else if (fourth == 7)
		{
			System.out.print("VII ");
		}
		else if (fourth == 6)
		{
			System.out.print("VI ");
		}
		else if (fourth == 5)
		{
			System.out.print("V ");
		}
		else if (fourth == 4)
		{
			System.out.print("IV ");
		}
		else if (fourth == 3)
		{
			System.out.print("III ");
		}
		else if (fourth == 2)
		{
			System.out.print("II ");
		}
		else if (fourth == 1)
		{
			System.out.print("I ");
		}
		else if (fourth == 0)
		{
			System.out.print(" ");
		}
	
	}
}


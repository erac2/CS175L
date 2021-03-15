import java.util.Scanner;
import javax.swing.JOptionPane;
public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		//Declare the variables
		
		String bDay;
		String currentDate;
		int Year2;
		int Month2;
		int Day2;
		int Year;
		int Month;
		int Day;
		int finalMonth;
		int finalDay;
		int finalYear;
		
		//This part will be the JOtion part in which the program will ask the person
		//to begin inputting the information of his birth date and the current date.
		
		bDay = JOptionPane.showInputDialog("Enter your birthday: (MM/DD/YYYY)");
		JOptionPane.showMessageDialog(null, bDay);
		currentDate = JOptionPane.showInputDialog("Enter today's date: (MM/DD/YYYY)");
		JOptionPane.showMessageDialog(null, currentDate);
		
		//This next program will begin to input the birth months, days, and years into 
		//the program and convert them into integers.
		
		String birthYear = bDay.substring(6, 10);
		Year = Integer.parseInt(birthYear);
		String birthMonth = bDay.substring(0, 2);
		Month = Integer.parseInt(birthMonth);
		String birthDay = bDay.substring(3, 5);
		Day = Integer.parseInt(birthDay);
		
		//This next section will start to convert the current dates into integers so that the
		//program will be able to subtract the variables.
		
		String currentYear = currentDate.substring(6, 10);
		Year2 = Integer.parseInt(currentYear);
		String currentMonth = currentDate.substring(0, 2);
		Month2 = Integer.parseInt(currentMonth);
		String currentDay = currentDate.substring(3, 5);
		Day2 = Integer.parseInt(currentDay);
		
		//The next section will begin the computations.
		
		finalYear = (Year2 - Year);
		System.out.println(finalYear + " years.");
		
		if (Month2 <= Month)
		{
			finalMonth = Month2;
			finalYear = finalYear-1;
		}
		else
		{
			finalMonth = (Month2 - Month);
			System.out.println(finalMonth + " month(s).");
		}
		
		if (Day2 <= Day)
		{
			finalDay = Day2;
			finalMonth = finalMonth-1;
		}
			else
		{
			finalDay = (Day2 - Day);
			System.out.println(finalDay + "day(s).");
		}
		
		JOptionPane.showMessageDialog(null, "You are " + finalYear + " years old and " + finalMonth + " month(s) old.");
	}

}

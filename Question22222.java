import java.util.Scanner;
public class Question22222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numb;
		int integer;
		int value= 0;
		
		for (numb = 1; numb<=10; numb++)
		{
			for (integer = 1; value<10*numb; integer++)
			{
				value = numb*integer;
				System.out.printf("%10d" , value);
			}
			System.out.println("");
		}

	}

}

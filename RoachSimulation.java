import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
		String input = JOptionPane.showInputDialog("Enter the inital population: ");
		double roachPopulation = Double.parseDouble(input);
		
		RoachPopulation bugs = new RoachPopulation(roachPopulation);
		DecimalFormat wholeFormat = new DecimalFormat("0");
		JOptionPane.showMessageDialog(null, "The initial roach population is " + wholeFormat.format(bugs.getRoachPopulation()));
		
		int sP= 0;
		int x= 1;
		while (x<5)
		{
			bugs.breed();
			JOptionPane.showMessageDialog(null, "The Roach Population after the cycle " + x + " breeding is" + wholeFormat.format(bugs.getRoachPopulation()));
			if (x == 1) {
				String input2 = JOptionPane.showInputDialog("Enter spray percent (Ex:70 for 70%):");
				sP = Integer.parseInt(input2);
				
		}
			bugs.sprayPct(sP);
			JOptionPane.showMessageDialog(null, "The Roach Population after cycle " + x + " " + sP + " percent spraying is " + wholeFormat.format(bugs.getRoachPopulation()));
			sP = sP + 10;
			x= x+1;
		}
	}
	

}
}
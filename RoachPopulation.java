
public class RoachPopulation
{
	private double roachPopulation;
	private double sprayPct;

	public RoachPopulation (double amount)
{
	roachPopulation = amount;
}
	public void breed() {
	roachPopulation = roachPopulation*2;
}
	public void sprayPct(int spray)
	{
		sprayPct=spray*.01;
		roachPopulation = roachPopulation-(roachPopulation*sprayPct);
	}
	public double getRoachPopulation() {
		return roachPopulation;
	}
}

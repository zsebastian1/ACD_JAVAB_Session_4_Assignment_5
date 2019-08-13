package AssignmentSession4;

public class Savings extends Account {

	private double rateOfInterest;

	public Savings(int acctNum, String acctName, String acctBalance, double rateOfInterest) {
		super(acctNum, acctName, acctBalance);
		this.rateOfInterest = rateOfInterest;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
}

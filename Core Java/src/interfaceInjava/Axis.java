package interfaceInjava;

public class Axis implements Bank {

	
	
	@Override
	public double homeLoanInterest() {
		// TODO Auto-generated method stub
		return 9.45;
	}

	@Override
	public double carLoanInterest() {
		// TODO Auto-generated method stub
		return 10.20;
	}

	@Override
	public double savingInterest() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void goldLoanInterest() {
		// TODO Auto-generated method stub
		System.out.println("Gold Loan Interest : 12");
	}
	
	public void personalLoanInterest()
	{
		
	}

}

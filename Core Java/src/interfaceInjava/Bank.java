package interfaceInjava;

public interface Bank extends ReserveBank,WorldBank{
	int roi=5;
	
	public double homeLoanInterest();
	public double carLoanInterest();
}

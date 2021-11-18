package interfaceInjava;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b2=new Axis();
			
		System.out.println("Car Loan interest:"+b2.carLoanInterest());
		
		System.out.println("Home Loan interest:"+b2.homeLoanInterest());
		
		System.out.println("Saving interest:"+b2.savingInterest());
		
		b2.goldLoanInterest();
	}

}

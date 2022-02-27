package interfaceinjava;

public class Demo implements SBI,Axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new Demo();
		s.display_interest();
		s.input_accountdetails(12345);
		
		Axis a=new Demo();
		a.display_interestPersonal();
		a.display_interestCarLoan();
	}
	
	public void input_accountdetails(int n)
	{
		System.out.println("account number is : "+n);
	}

	@Override
	public void display_interest() {
		// TODO Auto-generated method stub
		System.out.println("Saving Account Interest is 4%");
	}
	
	public void display_interestPersonal()
	{
		System.out.println("Personal Loan Interest is 10.25% of Axis");
	}

	@Override
	public void display_interestCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("Car Loan interest :"+roi);
	}

}

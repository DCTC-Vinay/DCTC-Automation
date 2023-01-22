package superkeyword;

public class Account extends Employee{
	
	int emp_sal;
	String emp_city;
	
	public Account()
	{
		super(25458);
		emp_city="Mumbai";
		emp_sal=75000;
	}
	
	//it will call default constructor parent as we have not given call to the parent class constructor
	public Account(int emp_sal, String emp_city)
	{
		this.emp_sal=emp_sal;
		this.emp_city=emp_city;
	}
	
	public void emp_info()
	{
		
		System.out.println("Emp_id :"+emp_id);
		System.out.println("emp_sal :"+emp_sal);
		System.out.println("emp_city :"+emp_city);
		super.emp_info();
	}
	public void addition(int x, double y)
	{
		
	}
	public static void main(String[] args) {
		Account a1=new Account();
		a1.emp_info();
		a1.emp_designation();

		
		Account a2=new Account(65000, "Bangalore");
		a2.emp_info();
	}

}






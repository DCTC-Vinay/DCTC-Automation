package overriding;

public class Account extends Employee{
	
	int emp_sal;
	String emp_city;
	
	public Account()
	{
		emp_city="Mumbai";
		emp_sal=75000;
	}
	
	public void emp_info()
	{
		System.out.println("Emp_id :"+emp_id);
		System.out.println("emp_sal :"+emp_sal);
		System.out.println("emp_city :"+emp_city);
	}
	
	public static void main(String[] args) {
		Account a1=new Account();
		a1.emp_info();
		
		Employee e1=new Employee();
		e1.emp_info();
		
		//dynamic method dispatch
		Employee e2=new Account();
		e2.emp_info();
	}

}






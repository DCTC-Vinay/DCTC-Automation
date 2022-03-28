package inheritanceinjava;

public class Payroll extends Account_Details {

	public int salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payroll pr=new Payroll();

	//	pr.acc_number=12345;
	//	System.out.println(pr.acc_number);

		pr.emp_details();
		pr.acc_details();
		pr.sal_details();
		
	}
	
	public void sal_details()
	{
		salary=70000;
		System.out.println("Salary of Employee :"+salary);
	}

}

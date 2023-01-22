package superkeyword;

public class Employee {
	
	int emp_id;
	
	public Employee()
	{
		emp_id=78425;
	}
	
	public Employee(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	public void emp_info()
	{
		System.out.println("Parent Class Employee ID : "+emp_id);
	}	
	
	public void emp_designation()
	{
		System.out.println("Emp Designation : Test Engineer");
	}

}

package inheritance;

public class Finance extends Employee{

	
	int salary=89000;
	
	public Finance()
	{
		System.out.println("Inside Finance Constructor");
	}
	
	public void salary_details()
	{
		System.out.println("Inside Child Class Finance");
		System.out.println("Dept_id :"+dept_id);
		System.out.println("Dept Loc :"+dept_loc);
		System.out.println("Employee ID :"+emp_id);
		System.out.println("Employee City :"+emp_city);
		System.out.println("Salary :"+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finance f=new Finance();
		f.salary_details();
	}

}

package inheritanceinjava;

public class GrossSalary extends Employee {

	
	int hra=2500;
	int da=25000;
	int basic_sal=45000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrossSalary gs=new GrossSalary();
		gs.emp_details();
		gs.gross_salary();
	}
	
	public void gross_salary()
	{
		int gross=hra+da+basic_sal;
		System.out.println("Gross Salary : "+gross);
	}

}

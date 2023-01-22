package thiskeywordinjava;

//calling the constructor using this keyword
public class Employee {

	int emp_id;
	int emp_salary;
	String emp_city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee e1=new Employee();
		//e1.show();
		
		Employee e2=new Employee("Noida",487525,80000);
		e2.show();
	}
	
	public Employee()
	{
		//this("Mumbai",149275,75000);				//call to parameterised constructor
		emp_id=149125;
		emp_salary=65000;
		emp_city="Pune";
		this.show();
	}
	
	public Employee(String emp_city, int emp_id, int emp_salary)
	{
		this();					//call to default constructor
		this.emp_id=emp_id;
		this.emp_salary=emp_salary;
		this.emp_city=emp_city;
	}

	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Emp City :"+emp_city);
		System.out.println("Emp Salary :"+emp_salary);
	}
}

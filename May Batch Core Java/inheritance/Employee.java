package inheritance;

public class Employee extends Department{

	int emp_id=78956;
	String emp_city="Bangalore";
	
	public Employee()
	{
		System.out.println("Inside Employee Constructor");
	}
	public void emp_info()
	{
		System.out.println("Inside Child Class Employee");
		System.out.println("Dept_id :"+dept_id);
		System.out.println("Dept Loc :"+dept_loc);
		System.out.println("Employee ID :"+emp_id);
		System.out.println("Employee City :"+emp_city);
	}
	
	public void get()
	{
		System.out.println("Inside Child Class Employee");
	}
	
	public void get(int n)
	{
		System.out.println("Inside Child Class Value of n:"+n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference of child and object of child
		Employee e=new Employee();
		e.dept_info();
		e.emp_info();
		e.get();
		e.get(56);
		
		
		//reference of parent and object of parent
		Department d1=new Department();
		d1.get();
		d1.get(89);
		
		//reference of parent and object child
		//dynamic method dispatch 
		Department d2=new Employee();
		d2.get(123);
	}
}




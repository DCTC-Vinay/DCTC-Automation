package abstractclassinjava;

public class Demo extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		d.get_details();
		d.get_salary();
	}

	@Override
	public void get_details() {
		// TODO Auto-generated method stub
		System.out.println("Emp id:"+emp_id);
	}

	@Override
	public void get_salary() {
		// TODO Auto-generated method stub
		float gross=(float) (emp_sal+(emp_sal*0.05));
		System.out.println("Employee Salary :"+gross);
	}

}

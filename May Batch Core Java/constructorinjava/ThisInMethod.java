package constructorinjava;

public class ThisInMethod {

	int emp_id;
	String emp_city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisInMethod t=new ThisInMethod();
		t.get();
		System.out.println("Employee City :"+t.emp_city);
		System.out.println("Employee ID :"+t.emp_id);
		
	}
	
	public ThisInMethod()
	{
		show(this);
	}
	
	public void get()
	{
		show(this);
	}

	public void show(ThisInMethod u)
	{
		u.emp_id=5889;
		u.emp_city="Mumbai";
	}

}

package finalkeywordinjava;

public class A {

	
	final int k=12; //you cant assign value to final variable
	int n=34;
	
	public void get_empid()
	{
		n=k+56;
		n=90;
		System.out.println(k);
	}
	
	public final void get_empsalary()
	{
		System.out.println("Value of n:"+n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		a1.get_empid();
		a1.get_empsalary();
	}

}

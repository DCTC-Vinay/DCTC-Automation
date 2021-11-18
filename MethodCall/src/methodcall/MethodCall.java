package methodcall;

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			valueCheck(15.87f,45,76.54);
			int e=check(12);
			System.out.println("Result is : "+e);
			
			MethodCall m=new MethodCall();
			m.print(15); //non static 
			int x=m.show();
			System.out.println("Value of x :"+x);
	}
		
	static int check(int n) 
	{
		int d=n+n;
		return d;
	}
	
	static void valueCheck(float f, int a,double n) //with parameter method
	{
		System.out.println("The Value is : "+f);
		System.out.println("The Value is : "+a);
		System.out.println("The Value is : "+n);
	}

	void print(int n)
	{
		System.out.println("in a print method : "+n);
	}
	
	int show()
	{
		System.out.println("in a show method");
		return 12;
	}
}

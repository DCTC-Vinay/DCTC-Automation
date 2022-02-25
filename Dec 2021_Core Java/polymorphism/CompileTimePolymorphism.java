package polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolymorphism ctp=new CompileTimePolymorphism();
		ctp.show();
		ctp.show(12);
		
		int sum=ctp.show(23,34);
		System.out.println("Sum = "+sum);
		
	}
	
	public void show()
	{
		System.out.println("Inside method show");
	}
	
	public void show(int a)
	{
		System.out.println("Inside method show a: "+a);
	}
	
	public int show(int a, int b)
	{
		System.out.println("Inside method show a and b: "+a+" : "+b);
		return a+b;
	}

}

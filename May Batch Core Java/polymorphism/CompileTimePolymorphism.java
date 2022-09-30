package polymorphism;

public class CompileTimePolymorphism {

	int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolymorphism c1=new CompileTimePolymorphism();
		c1.square();
		c1.square(5.75);
		c1.square(4.2);
		c1.square(5.25f);
		c1.square(14);
		
		CompileTimePolymorphism c2=new CompileTimePolymorphism(12);
		c2.square();
	}
	
	//compile time polymorphism -- constructor overloading
	public CompileTimePolymorphism()
	{
		n=45;
	}
	
	public CompileTimePolymorphism(int x)
	{
		n=x;
	}
	
	//compile time polymorphism -- method overloading
	public void square()
	{
		int q=n*n;
		
		System.out.println("Square is :"+q);
	}
	
	public void square(int a)
	{
		int x=a*a;
		System.out.println("Square of a : "+x);
	}
	
	public void square(double x)
	{
		double w=x * x;
		System.out.println("Square of x :"+w);
	}

	public void square(float s)
	{
		float z=s * s;
		System.out.println("Float Version Square: "+z);
	}
}

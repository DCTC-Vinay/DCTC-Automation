package polymorphisminjava;

public class MethodOverloadingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingInJava m1=new MethodOverloadingInJava();
		m1.add(12,34);
		m1.add();
		m1.add(34.5f,67.34f);
		m1.add(12.5, 12.5);
	}

	public void add()
	{
		double e=75.34;
		double f=12.56;
		
		double addition=e+f;
		System.out.println("Addition of Double Values : "+addition);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of int Values : "+c);
	}
	
	public void add(float a,float b)
	{
		float c=a+b;
		System.out.println("Addition of float Values : "+c);
	}
	
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("Addition of double Values In Parameters: "+c);
	}
}

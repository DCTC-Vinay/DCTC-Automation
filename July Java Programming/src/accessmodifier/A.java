package accessmodifier;

//same class, same package
public class A {
	
	public int a;			//public accessibility
	private double b;		//private accessibility
	float c;				//default accessibility
	protected boolean d;	//protected accessibility
	
	public static void main(String[] args) {
		
		A a1=new A();
		a1.getA();
		a1.getB();
		a1.getC();
		a1.getD();
		
	}
	
	public int getA()
	{
		return a;
	}
	
	private double getB()
	{
		return b;
	}
	
	float getC()
	{
		return c;
	}
	
	protected boolean getD()
	{
		return d;
	}
}

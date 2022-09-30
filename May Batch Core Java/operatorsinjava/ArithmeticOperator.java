package operatorsinjava;

public class ArithmeticOperator {

	int a,b,c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperator a1=new ArithmeticOperator();
		
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
	}
	
	public void add()
	{
		a=45;
		b=75;
		
		c=a+b;
		System.out.println("Addition :"+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction ="+c);
	}
	
	public void mul()
	{
		c=a * b;
		System.out.println("Multiplication ="+c);
	}
	
	public void div()
	{
		c=a/b;
		System.out.println("Division : "+c);
	}
	
	public void mod()
	{
		float x=9, y=2;
		float z=x % y;
		System.out.println("Modulus :"+z);
	}

}





package operatorinjava;
public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator u=new UnaryOperator();
		u.unary();
	}
	
	public void unary()
	{
		int a=12;
		a++;					//post increment
		System.out.println(a);
	
		a--;					//post decrement
		System.out.println(a);
		
		int e=55;
		++e;					//pre increment
		System.out.println(e);
	
		--e;					//pre decrement
		System.out.println(e);
		
		//pre increment and post increment
		int x, y=90;
		x= ++y;
		System.out.println("x ="+x);
		System.out.println("y ="+y);
	
		int c=-13;
		int d = ~c;		//compliment or invert
		System.out.println("value of d :"+d);
	}
}

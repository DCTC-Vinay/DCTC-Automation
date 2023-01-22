package operator;
public class UnaryOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unary operator --
		int a=10;
		a++;			//a=a+1
		System.out.println("Value of a:"+a);
		
		int b=45;
		b--;			//b=b-1
		System.out.println("Value of b:"+b);	
		
		int x=34, y=56, z, m;
		z=x++;			//postfix -- the older values gets assigned first then its increments
		System.out.println("Value of x :"+x+" z="+z);
		
		m=++y;			//prefix -- it increments first and then assigns the values
		System.out.println("Value of x :"+m+" y="+y);
	}
}

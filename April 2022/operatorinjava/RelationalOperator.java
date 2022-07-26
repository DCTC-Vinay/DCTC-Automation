package operatorinjava;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=76, b=76;
		
		System.out.println("Value of a :"+a+" Value of b :"+b);
		boolean c = a < b;
		System.out.println("a less than b : "+c);
		
		c = a > b;
		System.out.println("a greater than b : "+c);
		
		c = a <= b;
		System.out.println("a less than equal to b : "+c);
		
		c = a >= b;
		System.out.println("a greater than equal to b : "+c);
		
		c = a == b;
		System.out.println("a equal to b : "+c);
		
		c = a != b;
		System.out.println("a not equal to b : "+c);
		
	}

}

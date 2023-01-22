package operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=32, b=13, c;
		c= a & b;
		System.out.println("a & b :"+c);
		
		c= a | b;
		System.out.println("a | b :"+c);
		
		c= a ^ b;
		System.out.println("a ^ b :"+c);
	}
}
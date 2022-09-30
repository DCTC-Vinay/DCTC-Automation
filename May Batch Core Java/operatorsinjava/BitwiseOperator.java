package operatorsinjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12, b=14;		//local variables
		int c= a & b;		//both input must be 1
		
		System.out.println("AND Operation : "+c);
		
		c=a | b;			//if both inputs are 0 output is 0 otherwise 1
		System.out.println("OR Operation :"+c);
		
		c=a ^ b;
		System.out.println("XOR Operation :"+c);
	}
}

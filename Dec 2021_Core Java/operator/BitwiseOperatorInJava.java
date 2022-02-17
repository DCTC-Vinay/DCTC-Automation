package operator;

public class BitwiseOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=12,c;
		
		c= a & b;		//and operation
		
		System.out.println("Bitwse And operation : "+c);
		
		
		c=a | b;		//OR operation
		
		System.out.println("Bitwise OR operation : "+c);
		
		c=a ^ b;		//XOR operation
		
		System.out.println("Bitwise XOR operation : "+c);
	}

}


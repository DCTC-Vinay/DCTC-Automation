package bitwiseoperator;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7, b=8;
		
		//Bitwise AND operation
		int c=a & b;
		System.out.println("Bitwise AND : "+c);
		
		//Bitwise OR operation
		int d= a|b;
		System.out.println("Bitwise OR : "+d);
		
		//Bitwise XOR operation
		int e=a ^ b;
		System.out.println("Bitwise XOR :"+e);
		
		int m=47,n=64;
		int z=m | n;
		System.out.println("Bitwise OR : "+z);
	}

}

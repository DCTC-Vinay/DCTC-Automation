package operatorinjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static method called so no need of object
		bitwise();
	}
	
	public static void bitwise()
	{
		// calculating the binary from decimal value
		// 1110 -----14--- 0*2^0 + 1*2^1 + 1*2^2 + 1*2^3

		int a = 8, b = 6;

		// if both bits are 1 then only output is 1

		int c = a & b;

		System.out.println(c);

		// if one of the input is 1 output is 1

		c = a | b;

		System.out.println(c);

		// if both bits are 0 or 1 output is 0
		c = a ^ b;

		System.out.println(c);
	}

}

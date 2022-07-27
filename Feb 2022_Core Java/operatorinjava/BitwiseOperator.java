package operatorinjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=9;
		int c;
		
		//For getting Binary Value of Decimal Number
		String str=Integer.toBinaryString(a);
		System.out.println(str);
		
		str=Integer.toBinaryString(b);
		System.out.println(str);
		
		c=a & b;
		
		System.out.println(c);
		
		c=a | b;
		System.out.println(c);
		
		c=a ^ b;
		System.out.println(c);
	}

}

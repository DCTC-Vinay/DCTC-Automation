package operatorsinjava;

public class BitwiseOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;		// 1010
		int b=11;		// 1011
		//----------------------
		//				   1010 ----10
		//				   1011	----11
		//				   0001 ----1
		int c = a&b;
		System.out.println("And ="+c);
		
		c=a|b;			
		System.out.println("OR ="+c);
		
		c=a^b;
		System.out.println("XOR="+c);
		
	}

}

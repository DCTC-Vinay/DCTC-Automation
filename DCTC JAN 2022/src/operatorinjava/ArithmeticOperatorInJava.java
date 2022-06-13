package operatorinjava;

public class ArithmeticOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic Operator
		
		int w=12;
		int x=34;
		
		int c= w + x;
		System.out.println("Addition : "+c);
		
		c=w - x;
		System.out.println("Substraction : "+c);
		
		c=w * x;
		System.out.println("Multiplication : "+c);
		
		float q=(float)x / w;
		System.out.println("Division : "+q);
		
		float g=34;
		float h=12;
		
		float n=g/h;
		System.out.println("Division : "+n);
		
		n=g % h;
		System.out.println("Modulus : "+n);
		
		c=x % w;
		System.out.println("Modulus : "+c);
	}

}

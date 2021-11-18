package arithmeticoperator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=78;
		int b=45;
		int add;
		int substract;
		
		add=a+b;  // a & b will be added and result is stored in variable add
		
		System.out.println(add);
		
		substract=a-b;
		
		System.out.println(substract);
		
		int multiply;
		multiply=a*b;
		System.out.println(multiply);
		
		float f=(float)a/b;
		System.out.println(f);
		
		double div=(double)a/b;
		System.out.println(div);
		
		float c=76;
		double d=67;
		
		double addition=c+d;
		System.out.println(addition);
		
		double remainder=c%d;
		System.out.println(remainder);
		
		char m='A';
		System.out.println("Value of m = "+m);

		int t=129;
		char x=(char)t;
		System.out.println("Character is :"+x);
		
		
		char w='s';
		int r=(int)w;
		System.out.println("ASCII is :"+r);
		
	}
}

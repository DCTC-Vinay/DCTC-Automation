package operator;

public class UnaryOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=35,d;
		
		
		
		d=c--;			//post decrement
		
		System.out.println("Value of C ="+c);
		System.out.println("Value of d ="+d);
		
		
		int e=23,f;
		
		f=--e;
		
		System.out.println("Value of E ="+e);
		System.out.println("Value of F ="+f);
		
		
		int a=23, b=34;
		
		a++;		//increment operator
		
		System.out.println("Value of a = "+a);
		
		b--;		//decrement operator
		
		System.out.println("Value of b = "+b);
		
		int x=127;
		int n=~x;	//not operation
		System.out.println("value of n = "+n);
	}

}

package exceptioninjava;


//finally block
public class Test {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		
		float c=0;
		int a[]= {2,3,0};
		
		c=a[0]/a[2];
		
		System.out.println("Value of C :"+c);
		
		c=a[0]+a[1];
		
		System.out.println("Addition :"+c);
	}

}

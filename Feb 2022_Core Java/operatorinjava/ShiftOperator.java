package operatorinjava;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		int c = a<<1;
		System.out.println(c);
		
		a=12;
		c=a>>1;
		System.out.println(c);
		
		//Assignment Operator
		int e=4,f=5;
		e%=f;			//e=e%f
		System.out.println(e);
	}

}

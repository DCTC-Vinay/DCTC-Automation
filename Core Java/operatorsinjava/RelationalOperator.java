package operatorsinjava;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Relational Operator
		
		int a=25;
		int b=26;
		
		boolean c = a<=b;		//less than equal to 
		
		System.out.println("a <= b ="+c);
		
		a=35;
		b=35;
		
		c=a>=b;					// greater than equal to
		System.out.println("a >= b ="+c);
		
		
		
		c=(a==b);					//equal to
		System.out.println("a == b ="+c);
		
		
		c=(a!=b);					//not equal to
		System.out.println("a != b ="+c);
		
	}

}

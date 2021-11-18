package unaryoperator;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emp_id=545;
		emp_id++; //postfix
		System.out.println(emp_id);
		
		emp_id--; //postfix
		System.out.println(emp_id);
		
		int a=7;
		int b= ~a;
		System.out.println("Unary NOT : "+b);		
		
		int n=5;
		--n; //prefix 
		System.out.println(n);
		
		int z=7;
		++z; //prefix operator
		System.out.println(z);
	}

}

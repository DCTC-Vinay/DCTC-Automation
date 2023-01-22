package operator;
public class RelationalOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12, b=12;
		boolean x;
		
		x=a < b;			//less than
		System.out.println("a < b - "+x);
		
		x=a > b;			//greater than			
		System.out.println("a > b - "+x);
		
		x=a <= b;			//less than equal to
		System.out.println("a <= b - "+x);
		
		x=a >= b;			//greater than equal to
		System.out.println("a >= b - "+x);
		
		x=a==b;				//equal to equal to
		System.out.println("a == b - "+x);
		
		x=a!=b;				//not equal to
		System.out.println("a != b - "+x);
	}
}

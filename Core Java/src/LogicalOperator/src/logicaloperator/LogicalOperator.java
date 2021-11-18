package logicaloperator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		boolean x=(a>12) && (a>3);
		System.out.println("Logical AND : "+x);
		
		boolean y=(a>12) || (a>3);
		System.out.println("Logical OR : "+y);

	}

}

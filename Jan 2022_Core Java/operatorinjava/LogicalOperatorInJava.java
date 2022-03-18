package operatorinjava;

public class LogicalOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		int b=5;
		int d=7;
		
		boolean c=(a < b) && (b < d);
		System.out.println("(a < b) && (b < d) : "+c);
		
		c=(a > b) || (b > d);
		System.out.println("a || b : "+c);
	
	}

}

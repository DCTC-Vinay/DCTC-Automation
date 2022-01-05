package operatorsinjava;

public class LogicalOperatorInJava {
	
	
	
	public static void main(String[] args) {

		// Logical Operator --- && , ||

		int a = 10;
		int b = 20;
		int d = 5;

		boolean c = (a < b) && (a < d);

		System.out.println(c);

		c = (a < b) || (a < d);

		System.out.println(c);
		
	}
}

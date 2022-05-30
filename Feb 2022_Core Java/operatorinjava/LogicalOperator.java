package operatorinjava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45,b=56,c=32;
		
		boolean d = (a<b) && (a<c);
		System.out.println(d);
		
		d=(a<b) || (a<c);
		System.out.println("Logical OR : "+d);
	}

}

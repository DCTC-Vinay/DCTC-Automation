package operatorsinjava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=51, b=56,c=52;
		
		boolean d = (a<b) && (a<c);
		System.out.println("Value of d : "+d);
		
		int x=25,y=75,z=35;
		
		boolean u=(x>y)||(x>z);
		System.out.println("Value of u : "+u);
		
		boolean r=true && true;
		System.out.println("value of r : "+r);
		
		boolean e=true || false;
		System.out.println("value of e : "+e);
	}

}

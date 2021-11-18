package assignmentoperator;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=25;
		a+=10;
		System.out.println("value of a : "+a);
		
		int c=75;
		c+=b;
		System.out.println("value of c : "+c);
		
		c-=b;
		System.out.println("value of c-=b : "+c);
		
		c*=b;
		System.out.println("value of c*=b : "+c);
		
		int d=2;
		c<<=d;
		System.out.println("value of c<<=b : "+c);
	}

}

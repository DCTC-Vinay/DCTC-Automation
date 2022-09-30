package operatorsinjava;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=23, y=25;
		boolean z;
		
		//less than operator
		z= x < y;
		System.out.println("x less than y :"+z);
		
		//greater than operator
		x=65;
		y=54;
		
		z= x > y;
		System.out.println("x greater than y :"+z);
		
		//less than equal to
			
		z=x <= y;
		System.out.println("x less than equal to y :"+z);
		
		//greater than equal to
		x=54;
		z=x >= y;
		System.out.println("x greater than equal to y :"+z);
		
		//equal to
		z=x==y;
		System.out.println("x equal to equal to y :"+z);
		
		//not equal to
		z=x!=y;
		System.out.println("x not equal to y :"+z);
	}
}








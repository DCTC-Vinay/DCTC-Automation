package operator;

public class RelationalOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 34, b = 34;

		boolean c = a <= b;		// Less than
	
		System.out.println("a < b = "+c);
		
		c=a >= b;			//Greater than
		
		System.out.println("a > b = "+c);
		
		float d=20.36f,e=20.35f;
		
		boolean g = d <= e;
		
		System.out.println("d <= e : "+g);
		
		g = d>=e;
		
		System.out.println("d >= e : "+g);
		
		
	}

}

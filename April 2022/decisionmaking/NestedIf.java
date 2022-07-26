package decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=45,y=45,z=12;
		if(x>y)
		{
			if(y>z)
			{
				System.out.println("x is greater than y and z");
			}
		}
		else
		{
			System.out.println("x is less than or equal to y");
		}
	}
}

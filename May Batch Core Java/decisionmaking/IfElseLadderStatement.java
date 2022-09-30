package decisionmaking;

public class IfElseLadderStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int per=12;
		if(per>=75)
		{
			System.out.println("distinction");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("second class");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("first class");
		}
		else if(per>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}

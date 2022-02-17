package decisionmaking;

public class IfElseLadderStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		IfElseLadderStatement obj=new IfElseLadderStatement();
		obj.grade();
	}
	
	
	public void grade()
	{
		int per=45;
		
		if(per>=75)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First Class");
		}
		else if(per>=40)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	

}

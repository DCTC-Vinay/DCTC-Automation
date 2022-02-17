package decisionmaking;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NestedIfStatement obj=new NestedIfStatement();
		obj.grade();
	}
	
	//nested if
	public void grade()
	{
		int num=10;
		if(num>12)			//outer block
		{
			System.out.println("Outer If Block Passed");
			if(num>33)		//inner block
			{
				System.out.println("Inner If Block Passed");
			}
			else
			{
				System.out.println("Inner If Block Failed");
			}
		}
		else
		{
			System.out.println("Outer If Block Failed");
		}
	}
	
	

}

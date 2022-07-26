package decisionmaking;
public class ElseIfLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfLadder e=new ElseIfLadder();
		e.calculate_grade(78);
	}
	
	public void calculate_grade(int per)
	{
	//	int per=39;
		
		if(per>=75)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First Class");
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

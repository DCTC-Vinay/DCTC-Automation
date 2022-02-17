package decisionmaking;

public class IfBlockStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		IfBlockStatement obj=new IfBlockStatement();
		//obj.evenAndOdd();
		obj.negativeNumber();
	}
	
	//Negative Number
	public void negativeNumber()
	{
		int num=0;
		
		if(num<0)
		{
			System.out.println("Number "+num+" is negative");
		}
		else
		{
			System.out.println("Number "+num+" is Positive");
		}
	}
	
	
	//Even and Odd Number
	public void evenAndOdd()
	{
		int num=14;
		
		if(num%2==0)
		{
			System.out.println("The Number "+num+" is Even");
		}
		else
		{
			System.out.println("The Number "+num+" is Odd");
		}
	}
	
	

}

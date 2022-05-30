package ifelsestatement;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=45,b=23,c=10;
		if(a<b)		//outer if
		{
			if(a<c)	//inner if
			{
				System.out.println("a is smaller");
			}
			else
			{
				System.out.println("a is greater than c");
			}
		}
		else
		{
			System.out.println("a is greater");
		}
	}

}

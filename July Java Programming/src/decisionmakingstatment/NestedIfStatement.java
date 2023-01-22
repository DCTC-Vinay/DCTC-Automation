package decisionmakingstatment;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=34, m=25;
		if(n==33)
		{
			if(m==24)
			{
				System.out.println("Value of n and m ="+n+" "+m);
				System.out.println("Value of n="+n+" m="+m);
			}
			else
			{
				System.out.println("Inner condition false block");
			}
		}
		else
		{
			System.out.println("outer condition false block");
		}
	}
}
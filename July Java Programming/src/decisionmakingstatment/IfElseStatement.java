package decisionmakingstatment;
public class IfElseStatement {
	public static void main(String[] args) {
		
		int a=25;
		if((a%2)==0)
		{
			System.out.println(a+" is Even");
		}
		else
		{
			System.out.println(a+" is Odd");
		}
		int x=46,y=45,z=76;
		if((x<y)&&(x<z))
		{
			System.out.println("x is smaller");
		}
		else
		{
			System.out.println("X is Greater");
		}
		System.out.println("It is after Else Block");
	}
}

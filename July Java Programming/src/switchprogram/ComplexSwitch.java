package switchprogram;

public class ComplexSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexSwitch c=new ComplexSwitch();
		c.switch_test_integer(39);
		c.switch_test_character('b');
	}
	
	public void switch_test_integer(int grade)
	{
		int g=grade/10;		
		switch(g)
		{
			case 10:
			case 9:
			case 8:
				System.out.println("Distinction");
				break;
			case 6:
				System.out.println("First Class");
				break;
			case 5:
				System.out.println("Second Class");
				break;
			case 4:
				System.out.println("Pass");
				break;
			default:
				if(grade>=75)
				{
					System.out.println("Distinction");
				}
				else if(grade<75 && g==7)
				{
					System.out.println("First Class");
				}
				else
				{
					System.out.println("Fail");
				}
			break;	
		}
	}
	
	public void switch_test_character(char choice)
	{
		switch(choice)
		{
			case 'b':
				System.out.println("In Case b");
				break;
			case 'A':
			case 'a':
				System.out.println("In Case a");
				break;
			default:
				System.out.println("In Default Case");
				break;
		}
	}

}

package switchprogram;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedSwitch ns=new NestedSwitch();
		ns.nested_switch_statement(1, 3);
	}
	
	public void nested_switch_statement(int d, int c)
	{
		switch(d)		//outer switch
		{
			case 1:
				System.out.println("Computer");
				switch(c)		//inner switch
				{
					case 1:
						System.out.println("FY Computer");
						break;
					case 2:
						System.out.println("SY Computer");
						break;
					case 3:
						System.out.println("TY Computer");
						break;
					default:
						System.out.println("No Division Available");
				}
				break;
			case 2:
				System.out.println("Mechanical");
				break;
			case 3:
				System.out.println("Civil");
				break;
			default:
				System.out.println("No Department Found");
		}
	}

}

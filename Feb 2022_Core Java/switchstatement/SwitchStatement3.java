package switchstatement;

public class SwitchStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedswitchStatement();
	}
	
	public static void nestedswitchStatement()
	{
		int i=1;
		int j=1;
		switch(i)				//outer switch
		{
			case 1:
				System.out.println("First Year");
				switch(j)		//inner switch
				{
					case 1:
						System.out.println("CSE");
						break;
					case 2:
						System.out.println("IT");
						break;
					case 3:
						System.out.println("Mech");
						break;
					case 4:
						System.out.println("Electrical");
						break;
					case 5:
						System.out.println("Civil");
						break;
				}
				break;
			case 2:
				System.out.println("Second Year");
				switch(j)		//inner switch
				{
					case 1:
						System.out.println("CSE");
						break;
					case 2:
						System.out.println("IT");
						break;
					case 3:
						System.out.println("Mech");
						break;
					case 4:
						System.out.println("Electrical");
						break;
					case 5:
						System.out.println("Civil");
						break;
				}
				break;
			case 3:
				System.out.println("Third Year");
				break;
			default:
				System.out.println("Java");
		}
	}
	

}

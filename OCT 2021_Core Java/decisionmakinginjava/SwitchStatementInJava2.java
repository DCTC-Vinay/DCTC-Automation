package decisionmakinginjava;

public class SwitchStatementInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch=1;
		
		switch(ch)
		{
			case 1:
				System.out.println("Engineering");
				int ch1=3;
				switch(ch1)
				{
					case 1:
						System.out.println("Mechanical");
						break;
					case 2:
						System.out.println("Computer");
						break;
					case 3:
						System.out.println("Electrical");
						break;
				}
				break;
			case 2:
				System.out.println("Medical");
				break;
			case 3:
				System.out.println("Pharmacy");
				break;
			default:
				System.out.println("Invalid Option");
		}
		
		System.out.println("Outside of Switch Block");
	}

}

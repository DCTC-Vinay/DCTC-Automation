package switchstatement;

public class SwitchStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1=3;	
		switch(ch1)
		{
			case 'a':
			case 'A':
				System.out.println("Choice 1");
				break;
			case 2:
				System.out.println("Choice 2");
				break;
			case 3:
				System.out.println("Choice 3");
				int ch2=1;
				switch(ch2)
				{
					case 1:
						System.out.println("Inner Switch Choice 1");
						break;
					case 2:
						System.out.println("Inner Switch Choice 2");
						break;
					default:
						System.out.println("Inner Switch Default");
				}
				break;
			case 4:
				System.out.println("Choice 4");
				break;
			default:
				System.out.println("Default Choice");	
		}
	}
}
package switchstatement;

public class SwitchStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='D';
		switch(ch)
		{
			case 5:
				System.out.println("Case 5");
				break;
			case 4:
			case 3:
				System.out.println("Case 4");
				System.out.println("Case 3");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 1:
				System.out.println("Case 1");
				break;
			case 'd':
			case 'D':
				System.out.println("In Case d");
				break;
			default:
				System.out.println("Default Case");
		}
	}

}

package second;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchStatement();
	}
	
	public static void switchStatement()
	{
		int ch=4;
		switch(ch)
		{
			case 1:
				System.out.println("English");
				break;
			case 2:
				System.out.println("Hindi");
				break;
			case 3:
				System.out.println("Marathi");
				break;
			default:
				System.out.println("Java");
		}
	}
	

}

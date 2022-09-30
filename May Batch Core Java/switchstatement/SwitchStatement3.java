package switchstatement;

public class SwitchStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int per=76/10;
		System.out.println(per);
		switch(per)
		{
			case 10:
			case 9:
			case 8:
				System.out.println("Distinction");
				break;
			case 7:
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
				System.out.println("Fail");
		}
	}

}

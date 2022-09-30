package switchstatement;

public class SwitchStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Press 1 for English 2 For Hindi");
		int ch1=1, ch2=2;
		
		switch(ch1)
		{
			case 1:
				System.out.println("English");
				System.out.println("Press 1 for Prepaid 2 Postpaid");
				switch(ch2)
				{
					case 1:
						System.out.println("Prepaid English");
						break;
					case 2:
						System.out.println("Postpaid English");
						break;
				}
			break;
			case 2:
				System.out.println("Hindi");
				System.out.println("Press 1 for Prepaid 2 Postpaid");
				switch(ch2)
				{
					case 1:
						System.out.println("Prepaid Hindi");
						break;
					case 2:
						System.out.println("Postpaid Hindi");
						break;
				}
			break;
		}
	}

}

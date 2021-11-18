package nestedswitch;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCheck();
	}
	
	static void switchCheck()
	{
		int a=2;
		int b=2;
		
		switch(a)  //outer switch
		{
			case 1:
				switch(b) //inner switch
				{
					case 1:
						System.out.println("Switch Sub Menu 1");
						break;
					case 2:
						System.out.println("Switch Sub Menu 2");
						break;					
				}
			break;
			case 2:
				System.out.println("Case 2 Main Menu");
				break;
			
		}
	}
}

package enumdatatype;

public class EnumDataType {

	enum Month {January, February, March, April, May, June, July, August};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Month m=Month.January;
		
		switch(m)
		{
			case January:
				System.out.println("Selected Month is January");
				break;
			case February:
				break;
			case March:
				break;
			case April:
				break;
			case May:
				break;
			case June:
				break;
			case July:
				break;
			case August:
				break;
		}
		
	}
}

package enumdatatype;

public class EnumDemo {

	enum month {January, February, March, April, May, June, July};
		
	enum TimeUnit {SECONDS, HOURS, MILLISECONDS};
	
	enum value{A,B,A1};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		switch(month.April)
		{
			case January:
				System.out.println("January");
				break;
			case February:
				System.out.println("February");
				break;
			case March:
				System.out.println("March");
				break;
			case April:
				System.out.println("April");
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

}

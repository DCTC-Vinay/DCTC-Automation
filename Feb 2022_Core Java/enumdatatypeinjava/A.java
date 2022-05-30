package enumdatatypeinjava;

public class A {
	
	enum Month {January,February,March,April,May,June, July};
	
	public static void main(String[] args) {
		
		Month m=Month.April;
		
		switch(m)
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
			case May:
				System.out.println("May");
				break;
			case June:
				System.out.println("June");
				break;
			case July:
				System.out.println("July");
				break;
		}
	}

}

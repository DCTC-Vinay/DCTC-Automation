package enumdatatypeinjava;

public class EnumDataTypeInJava {

	
	public enum days_of_week {monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		days_of_week d = days_of_week.friday;
		
		switch(d)
		{
			case monday:
				System.out.println("Monday");
				break;
			case tuesday:
				System.out.println("tuesday");
				break;
			case wednesday:
				System.out.println("wednesday");
				break;
			case thursday:
				System.out.println("thursday");
				break;
			case friday:
				System.out.println("friday");
				break;
			case saturday:
				System.out.println("saturday");
				break;
			case sunday:
				System.out.println("sunday");
				break;
			
		}
	}

}

package enumdatatypeinjava;

public class EnumDataTypeInJava {

	public enum month{January,February,March,April,May,June};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		month m=month.April;
		
		switch(m)
		{
			case January:
				System.out.println("Selected Month is January");
				break;
			case April:
				System.out.println("Selected Month is April");
				break;
		}
	}

}

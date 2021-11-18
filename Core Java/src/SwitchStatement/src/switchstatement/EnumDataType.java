package switchstatement;

public class EnumDataType {

	public enum week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};
	public enum subject {Marathi,English,Mathematics};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week we=week.Sunday;
		subject s=subject.Mathematics;
		
		switch(s)
		{
			case English:
				System.out.println("Case English");
				break;
			case Marathi:
				System.out.println("Case Marathi");
				break;
			case Mathematics:
				System.out.println("Case Maths");
				break;
		}
	}

}

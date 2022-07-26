package switchstatement;
import decisionmaking.ElseIfLadder;
import methodinjava.MethodInJava;

public class SwitchStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchStatement s=new SwitchStatement();
		s.switch_method();
	}
	public void switch_method()
	{
		MethodInJava m=new MethodInJava();
		ElseIfLadder e=new ElseIfLadder();
		int choice=5;
		switch(choice)
		{
			case 1:
				System.out.println("Choice 1");
				m.add(7.5f, 5.8);
				break;
			case 2:
				System.out.println("Choice 2");
				m.area(45, 5);
				break;
			case 3:
				System.out.println("Choice 3");
				e.calculate_grade(55);
				break;
			case 4:
				System.out.println("Choice 4");
				break;
			default:
				System.out.println("Default Choice");	
				break;
		}
	}
}

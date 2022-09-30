package decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21;
		int weight=52;
		int height=14;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("I am Eligible to Donate Blood ");
			}
			else
			{
				System.out.println("Not Eligible The Weight less than 50 : Weight ="+weight+" Age="+age);
			}
		}
		else
		{
			System.out.println("Not Eligible Your age is less than 18 : Weight="+weight+" Age="+age);
		}
	}

}

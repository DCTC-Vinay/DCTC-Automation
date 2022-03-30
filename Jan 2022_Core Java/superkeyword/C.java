package superkeyword;

public class C extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1=new C();
		C c2=new C(77);
	}
	
	public C()
	{
		System.out.println("Default C class");
	}
	
	public C(int a)
	{
		System.out.println("Parameterised C Class");
	}
	

}

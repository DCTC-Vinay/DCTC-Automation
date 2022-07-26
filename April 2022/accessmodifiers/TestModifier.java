package accessmodifiers;

public class TestModifier {

	public int a=12;
	private float b=94.45f;
	protected boolean x=true;
	char e='r';
	
	
	public void geta()
	{
		System.out.println("Value of a:"+a);
	}
	
	private void getb()
	{
		System.out.println("Value of b:"+b);
	}
	
	protected void getx()
	{
		System.out.println("Value of x:"+x);
	}
	
	void gete()
	{
		System.out.println("Value of e:"+e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestModifier t=new TestModifier();
		t.geta();
		t.getb();
		t.gete();
		t.getx();
		
	}

}

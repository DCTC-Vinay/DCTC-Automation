package overloading.constructor;

//constructor overloading
public class TestConstructor {

	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestConstructor t1=new TestConstructor();
		t1.show();
		TestConstructor t2=new TestConstructor(12, 55);
		t2.show();
	}
	
	public TestConstructor()
	{
		x=45;
		y=85;
	}
	
	public TestConstructor(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void show()
	{
		System.out.println("value of x : "+x+" y :"+y);
	}
}

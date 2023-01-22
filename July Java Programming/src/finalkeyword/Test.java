package finalkeyword;


//if we have class as final we cant inherit
public final class Test {
	
	public void getData()
	{
		System.out.println("Inside getData method of Test Class");
	}

	
	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.getData();
	}
}

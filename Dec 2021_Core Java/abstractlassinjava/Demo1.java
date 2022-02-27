package abstractlassinjava;

public class Demo1 extends Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.input();
		d1.show();
		
	}

	
	  public Demo1() 
	  { 
		  System.out.println("Demo1 Constructor"); 
	  }
	 
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method");
	}

}

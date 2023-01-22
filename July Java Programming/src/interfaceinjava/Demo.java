package interfaceinjava;

public class Demo extends Employee implements Abc, Xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calling methods by passing reference of interface
		Abc a1=new Demo();
		a1.show();
		a1.getData();
		a1.sameMethod();
		
		// calling methods by passing reference of interface
		Xyz x1=new Demo();
		System.out.println(x1.getID());
		System.out.println(x1.getName());
		x1.sameMethod();
		
		Abc.get();		//calling static method of interface
		
		
		//Calling the methods Using Demo Object
		/*Demo d1=new Demo();
		d1.show();
		d1.getData();
		
		System.out.println(d1.getID());
		System.out.println(d1.getName());*/
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("value of x : "+x);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("value of y : "+y);
		System.out.println("value of n : "+Abc.n);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		System.out.println("value of n : "+Xyz.n);
		return 14587;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Vinay";
	}

	@Override
	public void sameMethod() {
		// TODO Auto-generated method stub
		System.out.println("Inside Demo Class");
	}
	
}

package overloading.method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m1=new MethodOverloading();
		m1.getData();
		m1.getData(45);
		m1.getData(17.34);
		m1.getData(30.20);
	}
	
	public void getData()
	{
		System.out.println("inside getdata method no parameter");
	}
	
	public void getData(int x)
	{
		System.out.println("inside getdata method : value of int x -"+x);
	}
	
	public void getData(float w)
	{
		System.out.println("inside getdata method : value of float w -"+w);
	}
	
	public void getData(double y)
	{
		System.out.println("inside getdata method : value of double y -"+y);
	}

}

package methodinjava;

public class MethodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodInJava m=new MethodInJava();
		m.test(15);
		m.display("Hello", "Hi");
		m.area(5, 8);
		m.add(52.50f, 70.20);
		m.avg(45,46,47);
		
	}
	
	public void avg(int a, int b, int c)
	{
		float avg=(a+b+c)/3;
		System.out.println("Average is : "+avg);
	}
	
	public void add(float a, double b)
	{
		double addition=a + b;
		System.out.println("addition is : "+addition);
	}
	
	
	public void test(int a)
	{
		a+=34;
		System.out.println(a);
	}
	
	public void display(String str, String str1)
	{
		String str2=str+str1;
		
		System.out.println(str2);
	}
	
	public void area(int height, int width)
	{
		int area_rect=height * width;
		System.out.println("Area of Rectangle :"+area_rect);
	}

}

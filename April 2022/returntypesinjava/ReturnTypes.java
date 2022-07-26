package returntypesinjava;

public class ReturnTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypes r=new ReturnTypes();
		int x=r.sum(10, 50);
		System.out.println("Sum : "+x);
		
		boolean y=r.boolean_m();
		System.out.println("Boolean : "+y);
		
		float z[]=r.array_m();
		int n=z.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(z[i]);
		}
		
		String str=r.string_m();
		System.out.println(str);
	}
	public String string_m()
	{
		return "Hello Automation";
	}
	public int sum(int a,int b)
	{
		return (a + b);
	}
	public boolean boolean_m()
	{
		return false;
	}
	public float[] array_m()
	{
		float t[]= {17.5f,8.9f,5.6f,8.8f};
		return t;
	}
}
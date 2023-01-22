package wrapperclass;

public class OwnWrapper {
	
	int z;
	String str;
	public OwnWrapper()
	{
		
	}
	
	public OwnWrapper(int z)
	{
		this.z=z;
	}
	
	public OwnWrapper(String x)
	{
		str=x;
	}
	
	public int getValue()
	{
		return z;
	}
	
	public void setValue(int z)
	{
		this.z=z;
	}
	
	public String toString()
	{
		return Integer.toString(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OwnWrapper o=new OwnWrapper(25);
		System.out.println(o);
	}
}

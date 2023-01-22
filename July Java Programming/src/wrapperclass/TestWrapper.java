package wrapperclass;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Converting Primitive data type into Object
		
		int a=56;		//primitive data type
		float z=85.65f;
		
		Integer i=new Integer(25);
		System.out.println("value of a primitive data : "+a);
		System.out.println("value of i object : "+i);
		
		Integer n=Integer.valueOf(a);		//explicit conversion
		System.out.println("value of n object : "+n);
		
		float t=25.45f;
		Float f=t;				//autoboxing-- implicit conversion
		System.out.println("value of f object : "+f);
		
		
		Float x=Float.valueOf(t);	//explicit conversion
		System.out.println("value of x object : "+x);
		
		
		//Converting Object into Primitive Data Type
		Long l=new Long(23564);
		long s=l.longValue();
		System.out.println("Value of s : "+s);
		
		Integer d=new Integer(254256);
		int e=d.intValue();
		System.out.println("Value of e : "+e);
		
		Boolean v=new Boolean(true);
		boolean h=v.booleanValue();
		System.out.println("value of h : "+h);
	}

}

package wrapperclassinjava;

public class WrapperClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		System.out.println(str);
		
		int j=10;
		Integer i=new Integer(10);
		String str1=i.toString();
		
		Integer k=new Integer(10);
		String str2=k.toString();
		
		String str3=str1+str2;
		
		System.out.println(str3);
		
		
		Double d=new Double(45.34);
		int n=d.intValue();
		System.out.println("Value n : "+n);
		
		Character c=new Character('A');
		n=c.valueOf(c);
		System.out.println("Value of c:"+n);
		
	}

}

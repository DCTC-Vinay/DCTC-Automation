package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Hello");
		
		String str1=str.toUpperCase();
		System.out.println("In Upper Case :"+str1);
		
		String str2=str1.toLowerCase();
		System.out.println("Lower Case :"+str2);
		
		str2=str1.concat(str2);
		System.out.println("Concat :"+str2);
		
		str2=str+str1;
		System.out.println("Concat :"+str2);
		
		System.out.println("Length of Str2:"+str2.length());
	}
}

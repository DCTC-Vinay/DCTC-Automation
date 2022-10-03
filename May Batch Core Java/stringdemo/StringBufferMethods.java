package stringdemo;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello World");
		
		System.out.println(sb);
		sb.append(" Programming");
		System.out.println(sb);
		sb.insert(5, "-");
		System.out.println(sb);
		sb.insert(6, "Object");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

		System.out.println(sb.length());
		
		sb.insert(2, "hi");
		System.out.println(sb);
		System.out.println(sb.length());
	}

}

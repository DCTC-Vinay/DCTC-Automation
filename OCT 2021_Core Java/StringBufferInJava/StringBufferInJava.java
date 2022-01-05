package StringBufferInJava;

public class StringBufferInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello Java");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		sb.append(" Programming");
		
		System.out.println(sb);
		
		sb.insert(5, "and Hi");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.reverse());
	}

}

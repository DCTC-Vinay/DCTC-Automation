package stringandstringbuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("ABCD");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append("XYZ");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.insert(2, "EFGH");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.delete(3, 6);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}

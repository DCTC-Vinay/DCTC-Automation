package stringinjava;

public class StringBufferInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("HelloProgramming");
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(5, "-");
		System.out.println(sb);
		
		sb.insert(6, " Object Oriented ");
		System.out.println(sb);
	
		sb.replace(0, 5, "Hi");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		sb.insert(40, "test");
		
		sb.insert(16, "-------");
		System.out.println(sb);
		
		
	}

}

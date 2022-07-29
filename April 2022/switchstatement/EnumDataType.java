package switchstatement;

public class EnumDataType {

	enum em {January,February,March}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		em x=em.January;
		
		switch(x)
		{
			case January:
				System.out.println("January");
				break;
			case February:
				System.out.println("February");
				break;
			case March:
				System.out.println("March");
				break;
		}
		for(em e:em.values())
		{
			System.out.println(e);
		}
		
		int a[]= {78,56,98,20,15};
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String b[]= {"Hi","Hello","Bye"};
		for(String i:b)
		{
			System.out.println(i);
		}
		
	}

}

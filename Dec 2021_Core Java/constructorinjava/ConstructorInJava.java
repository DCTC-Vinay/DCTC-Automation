package constructorinjava;

public class ConstructorInJava {

	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorInJava cij=new ConstructorInJava();
		
		ConstructorInJava cij1=new ConstructorInJava();
		
		cij1.j=14;
		
		System.out.println(cij1.j);
		
		ConstructorInJava cij2=new ConstructorInJava(18);
		
		System.out.println("Value of J for cij2 : "+cij2.j);
	}

	public ConstructorInJava()	//Default Contructor
	{
		this.j=12;
		System.out.println("value of j :"+j);
	}
	
	public ConstructorInJava(int j)
	{
		this.j=j;
		
	}
	
}

package methodwithparameter;
public class Abc {
	
	int n = 76; // class variable
	static int count=0;
	
	public static void main(String[] args) {
		Abc a1 = new Abc();
		a1.display_n_classvariable();
		a1.display_n_localvariable();
		a1.display_staticvariable();
		
		Abc a2=new Abc();
		a2.display_staticvariable();
			
		System.out.println(count);
		System.out.println("Value of n in main :"+a2.n);
		System.out.println("Value of n in main :"+a1.n);
		
		a1.n=65;
		System.out.println("Value of n after change :"+a2.n);
		System.out.println("Value of n after change :"+a1.n);
	}
	public void display_n_classvariable() {
		int x = 56, y = 75;
		n = x + y;
		System.out.println("Value of n in display :"+n);
		
	}
	public void display_n_localvariable() {
		int x = 56, y = 75;
		int n = x + y;
		System.out.println("Value of n in display :"+n);
	}
	
	public void display_staticvariable()
	{
		count++;
	}
}
package intefaceinjava;

public class E implements D{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E e1=new E();
		e1.c_display();
	}

	@Override
	public void c_add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int c_display() {
		// TODO Auto-generated method stub
		System.out.println("h="+h+" e="+e);
		return 0;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double d_take() {
		// TODO Auto-generated method stub
		return 0;
	}

}

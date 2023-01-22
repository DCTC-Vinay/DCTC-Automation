package operator;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 45, b = 50;
		int c = 70, d = 12;

		int x = (a > b) ? c : d;
		System.out.println("value of x :" + x);

		char y = (a > b) ? 'q' : 'r';
		System.out.println("value of y :" + y);

		boolean z = (a > b) ? true : false;
		System.out.println("value of z :" + z);
	}

}

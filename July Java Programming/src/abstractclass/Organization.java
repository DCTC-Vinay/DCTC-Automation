package abstractclass;

public class Organization extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Organization or=new Organization();
		or.getData();
		or.show_info();
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("Get Data Method of Employee Class");
	}

}

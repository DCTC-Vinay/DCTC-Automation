package interfaceinjava;

public class Bank implements BOB,SBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BOB b1=new Bank();
		b1.saving_account();
		System.out.println(b1.ROI);
		
		SBI s=new Bank();
		s.current_account();
	}

	@Override
	public void current_account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saving_account() {
		// TODO Auto-generated method stub
		
	}

}

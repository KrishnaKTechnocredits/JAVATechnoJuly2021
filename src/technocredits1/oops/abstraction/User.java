package technocredits1.oops.abstraction;

public class User implements Bank,RBI1, Cloneable{
	
	@Override
	public void gstCal() {
		System.out.println("RBI GstCal");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		User u1 = new User();
		u1.gstCal();
		Bank.m4();
	}
}

package technocredits1.oops.abstraction;

public interface Bank {
	
	void m1();
	
	default void gstCal() {
		System.out.println("Bank GSTCal");
	}
	
	default void m2(int x) {
		m3();	
		System.out.println("In overloaded m2");
	}
	
	default String m3() {
		return "Hi";
	}
	
}

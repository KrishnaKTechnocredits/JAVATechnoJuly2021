package precilla;

public class staticExample {
	void m2() {
		System.out.println("Non static");
	}
	static void m3() {
		System.out.println("Static");
	}
	public static void main(String[] args) {
		staticExample staticEx=new staticExample();
		staticEx.m2();//calling through object as it is non static
		m3();//calling directly as it is static
	}
}

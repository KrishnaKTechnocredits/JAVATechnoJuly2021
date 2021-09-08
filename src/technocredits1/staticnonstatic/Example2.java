package technocredits1.staticnonstatic;

public class Example2 {

	int x = 10;
	
	void m1() {
		System.out.println("I am in m1");
	}
	
	static void display() {
		System.out.println("Hello");
		Example2 example2 = new Example2();
		example2.m1();
		System.out.println(example2.x);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		Example2 example2 = new Example2();
		example2.display();
		example2.m1();
		//m1();
	}
	
}

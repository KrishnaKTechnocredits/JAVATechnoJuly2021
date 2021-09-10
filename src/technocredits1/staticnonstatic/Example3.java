package technocredits1.staticnonstatic;

public class Example3 {
	static int temp=10;
	int x = 10;
	
	void m2() {
		
	}
	
	void m1() {
		m2();
	}
	
	public static void main(String[] args) {
		System.out.println(temp);
	}
}

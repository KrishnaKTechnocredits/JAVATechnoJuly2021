package technocredits1.staticnonstatic;

public class Test {
	int x = 10;
	int y = 20;
	
	void processData() {
		x++;
		y++;
	}
	
	void display() {
		System.out.println("Value of x - " + x);
		System.out.println("Value of y - " + y);
	}
	
	public static void main(String[] args) {
		Test test1 = new Test();
		test1.processData();
		test1.processData();
		
		Test test2 = new Test();
		test2.processData();
		
		test1.display();
		test2.display();
	}
}

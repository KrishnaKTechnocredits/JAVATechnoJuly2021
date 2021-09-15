package technocredits1.staticnonstatic;

public class Example1 {
	static int x = 10;
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
		Example1 test1 = new Example1();
		test1.processData();
		test1.processData();
		
		Example1 test2 = new Example1();
		test2.processData();
		
		test1.display();
		test2.display();
	}
}

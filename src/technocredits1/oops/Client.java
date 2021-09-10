package technocredits1.oops;

public class Client {

	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.x); // 10
		System.out.println(parent.y); // 20
		parent.m1(); // Parent m1
		parent.m2(); // Child m2
	}
}

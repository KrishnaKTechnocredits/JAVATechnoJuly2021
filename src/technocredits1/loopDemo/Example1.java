package technocredits1.loopDemo;

public class Example1 {

	void display(String name) { //3
		System.out.println("Hi");
		for (int index = 1; index <= 5; index++) { //4
			System.out.println(name); // 5
		} //6
		System.out.println("Hello");
	
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1(); // 1
		example1.display("Maulik"); //2
	}
}

package technocredits1.loopDemo;

public class Example2 {

	void processData() {
		//int index=0;
		for(int index=0;index<5;index=index+3)
			System.out.println(index);
		System.out.println("Hi");
		
	}
	
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
			example2.processData();	
	}
}

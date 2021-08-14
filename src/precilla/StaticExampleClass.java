package precilla;

public class StaticExampleClass {
	
	public static void main(String[] args) {
		staticExample staticEx1=new staticExample();
		staticEx1.m2();//non static,so calling method through reference variable
		staticExample.m3();//its a static method in staticExample,so calling through class instead of object		
	}
}

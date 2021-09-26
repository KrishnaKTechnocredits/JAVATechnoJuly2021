package technocredits1.exceptionDemo;

public class Example8 {

	int m1(int y){
		try {
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			System.out.println("Hi");
			int x = 10/y;
		}
	}
	
	public static void main(String[] args) {
		Example8 example8 = new Example8();
		System.out.println(example8.m1(0));
	}
}

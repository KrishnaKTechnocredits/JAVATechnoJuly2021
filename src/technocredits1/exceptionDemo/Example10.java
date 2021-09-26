package technocredits1.exceptionDemo;

public class Example10 {

	int m1(int y){
		try {
			int x = 10/y;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Hello");
			int z = 10/y;
			System.out.println("GN");
		}
		finally {
			System.out.println("Hi");
		}
		return 10;
	}
	
	public static void main(String[] args) {
		Example10 example8 = new Example10();
		int temp = example8.m1(0);
		System.out.println(temp);
	}
}

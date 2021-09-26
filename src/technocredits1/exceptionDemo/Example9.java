package technocredits1.exceptionDemo;

public class Example9 {

	int m1(int y){
		try {
			int x = 10/y;
			System.out.println(x);
		}finally {
			System.out.println("Hi");
			 return 10;
		}
		//System.out.println("Hello");
		//return 10;
	}
	
	public static void main(String[] args) {
		Example9 example8 = new Example9();
		int temp = example8.m1(0);
		System.out.println(temp);
	}
}

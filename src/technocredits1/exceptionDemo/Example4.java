package technocredits1.exceptionDemo;

public class Example4 {
	Example4 example4;
	void printOutput(int[] num) {
		try {
			System.out.println(num[0]); // 2
			System.out.println(num.length/2); //2
			System.out.println(num[4]);
		
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Catch");
			try {
				try {
					try {
						example4.m1();
					}catch(ArithmeticException aae) {
						System.out.println(200);
					}
				}catch(IndexOutOfBoundsException ne) {
					System.out.println(100);
				}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
				System.out.println(1000);
			}
		}
	}
	
	void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		Example4 example2 = new Example4();
		example2.printOutput(new int[] {2,4,6,8});
		System.out.println("End");
	}
}

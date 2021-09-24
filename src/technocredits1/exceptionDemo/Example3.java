package technocredits1.exceptionDemo;

public class Example3 {
	void printOutput(int[] num) {
		try {
			System.out.println(num[0]); // 2
			System.out.println(num.length/2); //2
			try {
				System.out.println(num[4]);
			}catch(NullPointerException ae) {
				System.out.println("Inner Catch");
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Catch");
		}
		String str = "Maulik" + num[0]; // Maulik2
		int temp = Integer.parseInt(str.substring(6));
		System.out.println(temp);
		System.out.println(str.substring(0,7));
	}
	
	public static void main(String[] args) {
		Example3 example2 = new Example3();
		example2.printOutput(new int[] {2,4,6,8});
	}
}

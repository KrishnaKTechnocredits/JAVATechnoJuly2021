package technocredits1.arrayDemo;


public class Example1 {

	void displayArray(int[] input) {
		System.out.println("Length of an array is " + input.length);
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		int x = 10;
		Example1 example1 = new Example1();
		int[] num = new int[5];
		num[0] = 13;
		num[1] = 14;
		num[2] = 100;
		num[3] = 321;
		num[4] = 111;
		example1.displayArray(num);
	}
}

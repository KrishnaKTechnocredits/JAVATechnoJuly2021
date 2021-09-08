package technocredits1.arrayDemo;

public class Example2 {

	int sum(int[] input) {
		int sum = 0;
		for(int index=0;index<input.length;index++) {
			sum += input[index];
		}
		return sum;
	}
	
	void display() {
		int[] input = new int[5];
		input[0] = 10;
		input[1] = 20;
		input[2] = 30;
		int sum = 0;
		for(int index=0;index<input.length;index++) {
			sum += input[index];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		example2.sum(arr);
	}
}

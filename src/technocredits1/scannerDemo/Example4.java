package technocredits1.scannerDemo;

public class Example4 {

	int[] generateIntArray(String[] arr) {
		int[] num = new int[arr.length];
		for(int index=0;index<num.length;index++) {
			num[index] = Integer.parseInt(arr[index]);
		}
		System.out.println(num);
		return num;
	}
	
	public static void main(String[] args) {
		String str = "10 20 30 40 50";
		String[] input = str.split(" ");
		Example4 example4 = new Example4();
		int[] number = example4.generateIntArray(input);
		System.out.println(number);
	}
}

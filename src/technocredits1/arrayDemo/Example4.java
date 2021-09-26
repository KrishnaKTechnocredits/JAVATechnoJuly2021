package technocredits1.arrayDemo;

public class Example4 {
	static void processData(String[] arr) {
		arr[1] = "Akshay";
		//System.out.println(arr[1]);
	}
	
	static void changeData(int number) {
		number = 50;
	}
	
	public static void main(String[] args) {
		String[] input = {"Chandni","Dev"};

		Example4.processData(input);
		System.out.println(input[1]);
		
		int number = 10;
		Example4.changeData(number);
		System.out.println(number);
	}
}

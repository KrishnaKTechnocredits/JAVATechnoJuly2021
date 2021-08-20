package himanshu;

public class Assignment_19_Program4 {

	void sumOfAllNumber(String input) {

		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		System.out.println("Sum of numbers are : " + sum);
	}

	public static void main(String[] args) {

		String input = input = "10 10 20 30";

		Assignment_19_Program4 program4 = new Assignment_19_Program4();
		program4.sumOfAllNumber(input);

	}
}

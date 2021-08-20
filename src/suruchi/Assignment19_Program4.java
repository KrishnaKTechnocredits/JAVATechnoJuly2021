package suruchi;

public class Assignment19_Program4 {

	int getSumOfNumbersInString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment19_Program4 assignment19_Program4 = new Assignment19_Program4();

		String input = "10 10 20 30";
		System.out.println("String is as displayed: " + input);
		System.out.println();
		System.out.println("Sum of numbers in the string is: " + assignment19_Program4.getSumOfNumbersInString(input));
	}
}
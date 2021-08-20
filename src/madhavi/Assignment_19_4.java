package madhavi;

public class Assignment_19_4 {
	int getSum(String input) {
		String[] inpArray = input.split(" ");
		int sum = 0;
		for (int index = 0; index < inpArray.length; index++) {
			int num1 = Integer.parseInt(inpArray[index]);
			sum = sum + num1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment_19_4 assignment_19_4 = new Assignment_19_4();
		System.out.println("Print sum of all numbers in given string:");
		String input = "10 10 20 30";
		System.out.println(assignment_19_4.getSum(input));

	}
}

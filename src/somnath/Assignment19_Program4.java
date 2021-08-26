package somnath;
public class Assignment19_Program4 {
	int sumNumbersInStatement(String input) {
		int sum = 0;
		String[] splitArray = input.split(" ");
		for (int index = 0; index < splitArray.length; index++) {
			sum += Integer.parseInt(splitArray[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment19_Program4 assignment19_4 = new Assignment19_Program4();
		String input = "10 10 20 30";
		System.out.println("----------------------------------------------------");
		System.out.println("Sum of all numbers in given statement is : " + assignment19_4.sumNumbersInStatement(input));
		System.out.println("----------------------------------------------------");
	}
}
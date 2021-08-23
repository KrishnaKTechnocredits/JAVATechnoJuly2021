package neha;

/*program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/
public class Assignment19pg4 {
	int sumNumbersInStatement(String input) {
		int sum = 0;
		String[] splitArray = input.split(" ");
		for (int index = 0; index < splitArray.length; index++) {
			sum += Integer.parseInt(splitArray[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment19pg4 assignment19pg4 = new Assignment19pg4();
		String input = "10 10 20 30";
		System.out.println("Sum of all numbers in given statement is: " + assignment19pg4.sumNumbersInStatement(input));
	}
}

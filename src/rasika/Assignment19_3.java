package rasika;

public class Assignment19_3 {

	int sumOfNumbers(String input) {
		String[] output = input.split(" ");
		int sum = 0;
		for(int index = 0; index < output.length; index++) {
			sum = sum + Integer.parseInt(output[index]);
		}
		return sum;
	}
	public static void main(String[] args) {
		 Assignment19_3  assignment19_3 = new  Assignment19_3();
		 String string = "10 10 20 30";
		 System.out.println("The total is "+ assignment19_3.sumOfNumbers(string));
	}
}

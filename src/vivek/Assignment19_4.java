package vivek;

public class Assignment19_4 {

	int getSum(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment19_4 assignment19_4 = new Assignment19_4();
		String num = "10 10 20 30";
		System.out.println(assignment19_4.getSum(num));
	}
}

package shantanu.assignment11;

public class Sum {
	
	void displayTotalNumbersRequiredForSum(int total) {
		int sum = 0;
		int count = 0;
		while(sum < total) {
			count++;
			sum = sum + count;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.displayTotalNumbersRequiredForSum(100);
	}
}

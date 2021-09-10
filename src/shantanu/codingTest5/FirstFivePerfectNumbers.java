package shantanu.codingTest5;

public class FirstFivePerfectNumbers {
	boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int divisor = 1; divisor <= num/2; divisor++) {
			if(num%divisor == 0)
				sum += divisor;
		}
		if(sum == num)
			return true;
		else
			return false;
	}
	void displayFirstFivePerfectNumbers() {
		int count = 0;
		int num = 1;
		System.out.println("First 5 perfect numbers are:");
		while(count <= 5) {
			if(isPerfectNumber(num))
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	public static void main(String[] args) {
		FirstFivePerfectNumbers firstFivePerfectNumbers = new FirstFivePerfectNumbers();
		firstFivePerfectNumbers.displayFirstFivePerfectNumbers();
	}
}

package shweta_Dharmadhikari.PrimeNumber;

public class Assignment11_2 {

	void sumMoreThanHundered() {
		int count = 0;
		int sum = 0;
		int number = 1;
		while (sum <= 100) {
			sum = sum + number;
			number++;
			count++;
		}
		System.out.println("Required numbers to generate sum more than 100: " + count);

	}

	public static void main(String[] args) {
		Assignment11_2 assignment11_2 = new Assignment11_2();
		assignment11_2.sumMoreThanHundered();
	}
}

package devendra_SurprizeTest;

public class CodingTest5_9Sept {
	boolean isPerfectNum(int num) {
		int sum = 0;
		for (int divisor = 1; divisor <= num / 2; divisor++) {
			if (num % divisor == 0)
				sum += divisor;
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	void getPerfectFive() {
		int count = 0;
		int num = 1;
		System.out.println("First 5 perfect numbers are:");
		while (count <= 6) {
			if (isPerfectNum(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		//System.out.println("The first 5 perfect numbers are " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		CodingTest5_9Sept obj = new CodingTest5_9Sept();
		obj.getPerfectFive();
	}
}

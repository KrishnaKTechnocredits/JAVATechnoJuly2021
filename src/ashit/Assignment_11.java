package ashit;

public class Assignment_11 {
	int sum;
	int reqSum;
	int primeNumberCount;
	
	void findPrimeNumber(int number) {
			boolean status = true;
			int index=2;
			while(index<number) {
				if (number%index == 0) {
					status = false;
					break;
				}
				index ++;
			}
			if (status) {
				System.out.println(number + " is a prime number");
				primeNumberCount ++;
			}
	}
	
	void printPrimeNumbers(int range) {
		int index=1;
		while (primeNumberCount<range) {
			findPrimeNumber(index);
			index ++;
		}
	}
	
	void generateSum(int number) {
		int index=1;
		while(sum<=number) {
			sum = sum + index;
			index ++;
			reqSum ++;
		}
		System.out.println("The required numbers to generate the sum more than " + number + " are: " + reqSum);
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printPrimeNumbers(10);
		assignment_11.generateSum(100);
	}
}
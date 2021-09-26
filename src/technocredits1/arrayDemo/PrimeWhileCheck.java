package technocredits1.arrayDemo;

class PrimeWhileCheck {

	static int count;
	int sum = 0;
	int range;

	void primeCount(int number) {
		int index2 = 2;
		boolean status = true;

		while (index2 < number) {
			if (number % index2 == 0) {
				// System.out.println(number+" Num is not Prime");
				status = false;
				break;
			}
			index2++;
		}
		if (status) {
			// System.out.println(number + " Num is Prime Number");

			boolean flag = true;
			if (flag) {
				if (sum <= range)
					sumOfPrime(number);
				System.out.println("\nSum of Prime Number is: " + sum);
				System.out.println("Count of Prime Sum is: " + count);
			} else

				flag = false;
		}

	}

	int getSum(int num) {
		range = num;
		return range;
	}

	void sumOfPrime(int n) {
		if(sum < range) {
			sum = sum + n;
			count++;
		}
	}

	void checkPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num; index++) {
			if(sum > 100)
				break;
			primeCount(index);
		}
	}

	public static void main(String[] args) {
		PrimeWhileCheck primewhilecheck = new PrimeWhileCheck();
		primewhilecheck.getSum(10);
		primewhilecheck.checkPrime(100);

		// primewhilecheck.sumOfPrime();

		// System.out.println("Total prime count is " + primewhilecheck.count);

	}

}
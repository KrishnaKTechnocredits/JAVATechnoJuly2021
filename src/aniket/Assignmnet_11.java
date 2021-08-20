package aniket;

public class Assignmnet_11 {
	int primeCount = 0;
	
	void isPrimeNumbers(int num) {// 2
		boolean flag = true;
		int index = 2;
		while (index < num) {
			if (num % index == 0) {
				flag = false;
			}
			index++;//3
		}
		if (flag) {
			primeCount++;// count of prime numbers//2
			System.out.println(index);
		}

	}

	void firstNPrimeNumbers(int cnt) { //cnt=10

		int index = 2;
		while (primeCount < cnt) {//0<10
			isPrimeNumbers(index);
			index++; //4

		}

	}
	
	void sumOfNumbers(int num) {
		int sum=0;
		int index=1;
		int count=0;
		while(sum<num) {
			sum+=index;
			index++;
			count++;		
		}
		System.out.println(count + " numbers are required for sum of " + num);
	}

	public static void main(String[] args) {
		Assignmnet_11 assignment_11 = new Assignmnet_11();
		// assignment_11.isPrimeNumbers(10);
		assignment_11.firstNPrimeNumbers(10);
		assignment_11.sumOfNumbers(100);

	}

}

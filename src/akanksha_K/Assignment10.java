package akanksha_K;

public class Assignment10 {
	
	boolean isprimeNumber(int number) {
		boolean status = true;
		for (int index =2; index< number; index++) {
			if(number% index ==0) {
				status = false;
				break;
			}
		}
		return status;
	}
	
	void primeNumberInRange(int startnumber, int endnumber) {
		for (int number= startnumber; number<=endnumber; number++) {
			if(isprimeNumber(number)) {
				System.out.println(number + " is a prime number");
			}
			else {
				System.out.println(number + " is not a prime number");
			}
		}
	}
	
	int primeNumberCount(int startnumber, int endnumber) {
		int count=0;
		for (int number=startnumber; number<= endnumber; number++) {
			boolean isprime = isprimeNumber(number);
			if (isprime) {
				count = count + 1;	
			}
		}	
		System.out.println("Total count of prime numbers: " + count);
		return count;
	}
	
	int primeNumberSum(int startnumber, int endnumber) {
		int sum=0;
		for (int number=startnumber; number<= endnumber; number++) {
			boolean isprime = isprimeNumber(number);
			if (isprime) {
				sum = sum + number;	
			}
		}
		System.out.println("Total sum of prime numbers: " + sum);
		return sum;
	}
	
	void primeNumberAvg(int startnumber, int endnumber) {
		int sum = primeNumberSum(startnumber, endnumber);
		int count = primeNumberCount(startnumber, endnumber);
		float avg = sum/count;
		System.out.println("Avg of prime numbers: " + avg);
	}
	
	
	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.isprimeNumber(19);
		assignment10.primeNumberInRange(100,120);
		assignment10.primeNumberCount(100,120);
		assignment10.primeNumberSum(100,120);
		assignment10.primeNumberAvg(100,120);
	}

}

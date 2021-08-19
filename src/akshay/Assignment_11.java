package akshay;

public class Assignment_11 {
	
	int primeCount = 0;
	
	void primeNumbers(int num) {
		int index = 2;
		boolean status = true;
		
		while(index < num) {
			if(num % index == 0) {
				status = false;
				break;
			}
			index++;
		}
		if(status) {
			System.out.println(index + " number is prime");
			primeCount++;
		}
	}
	
	void firstNprimenumber(int number) {
		int index = 1;
		while(primeCount < number) {
			primeNumbers(index);
			index++;
		}
	}
	
	void sumofNumber(int num) {
		int index = 1;
		int sum = 0;
		int count = 0;
		while (sum < num) {
			sum = sum + index;
			index++;
			count++;
		}
		System.out.println("Count of prime number to sum of 100: " +count);
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment11 = new Assignment_11();
		assignment11.firstNprimenumber(10);
		assignment11.sumofNumber(100);
	}
}

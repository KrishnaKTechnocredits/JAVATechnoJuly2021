package laxman;

public class Assignment10 {
	
	
		int count = 0;
		int sum = 0;
		float average;

		void verifyPrimeNumbers(int number) {
			boolean status = true;
			for(int index = 2; index < number; index++) {
				if(number % index == 0) {
					status = false;	
					break;
				}	
			}
			if (status == true) {
				System.out.println(number + " is prime number");
				count++;
				sum = sum + number;
				average = (float)sum / count;
			}
		}

		void verifyPrimeNumberRange(int startindex, int endindex) {
			for (int index = startindex; index <= endindex; index++)
				verifyPrimeNumbers(index);
		}

		void countPrimeNumber() {
			System.out.println("Total prime numbers: " + count);
		}

		void sumofPrimeNumbers() {
			System.out.println("Sum of prime numbers: " + sum);
		}

		void averageofPrimeNumbers() {
			System.out.println("Averag of prime number: " + average );
		}

		public static void main(String[] args){
			Assignment10 assignment10 = new Assignment10();
			assignment10.verifyPrimeNumbers(10);
			assignment10.verifyPrimeNumberRange(10, 20);
			assignment10.countPrimeNumber();
			assignment10.sumofPrimeNumbers();
			assignment10.averageofPrimeNumbers();
		}
	}




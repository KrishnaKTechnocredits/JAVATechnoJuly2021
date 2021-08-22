package margi;

class Assignment_10{
	
	//number is prime or not
	void isPrime(int num){
		boolean flag = true;
		for(int index = 2; index < num; index++){
			if(num % index == 0){
				flag = false;
				System.out.println(num + " is not a Prime Number");
				break;
			}	
		}
		if(flag)
			System.out.println(num + " is a Prime Number");
	}
	
	//print all prime numbers in given range
	void primeNumbers(int start, int end){
		System.out.println("Prime Numbers between " + start + " and " + end + " are: ");
		for(int num = start; num <= end; num++){
			boolean flag = true;
			for(int index = 2; index < num; index++){
				if(num % index == 0){
					flag = false;
					break;
				}	
			}
			if(flag)
				System.out.println(num);
		}
	}
	
	//get total number of prime number in a given range
	void getCntPrimeNumber(int start, int end){
		int count=0;
		for(int num = start; num <= end; num++){
			boolean flag = true;
			for(int index = 2; index < num; index++){
				if(num % index == 0){
					flag = false;
					break;
				}	
			}
			if(flag)
				count++;
		}
		System.out.println("Total number of Prime Numbers are: " + count);
	}
	
	//Sum of prime numbers in given range
	void sumPrimeNumber(int start, int end){
		int sum=0;
		for(int num = start; num <= end; num++){
			boolean flag = true;
			for(int index = 2; index < num; index++){
				if(num % index == 0){
					flag = false;
					break;
				}	
			}
			if(flag)
				sum += num;
		}
		System.out.println("Sum of Prime Numbers are: " + sum);
	}
	
	//Average of prime numbers in given range
	void avgPrimeNumber(int start, int end){
		int sum=0, count = 0;
		for(int num = start; num <= end; num++){
			boolean flag = true;
			for(int index = 2; index < num; index++){
				if(num % index == 0){
					flag = false;
					break;
				}	
			}
			if(flag)
				count++;
				sum += num;
		}
		System.out.println("Average of Prime Numbers are: " + sum/count);
	}
	
 	public static void main(String[] args){
		Assignment_10 prime = new Assignment_10();
		prime.isPrime(13);
		prime.primeNumbers(100,120);
		prime.getCntPrimeNumber(100,120);
		prime.sumPrimeNumber(100,120);
		prime.avgPrimeNumber(100,120);
	}
}
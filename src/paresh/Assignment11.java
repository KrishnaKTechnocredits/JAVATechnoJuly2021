package paresh;

class Assignment11{

	int sum;
	int index;
	int primeCount;


	void checkSumMoreThan100(){	
		int cnt = 1;
        do {
            sum = sum + cnt;
			cnt++; 
			index++;
        }while (sum < 100);
		System.out.println("Count of numbers to generate sum more than 100 : \n" +index ); 
    }

	void printPrimeNumbers(int N) {
		boolean status = true;
		int index = 2;
		while (index < N) {
			if (N % index == 0) {
				status = false;
			}
			index++;
		}
		if (status) {
			primeCount++;
			System.out.println(index);
		}
	}

	void printPrimeNumbersRange(int range){
		int num = 2;
		while(primeCount<range){
		printPrimeNumbers(num);
		num++;
		}	

	}

	public static void main(String[] args){
		Assignment11 assignment11 = new Assignment11();
		System.out.println("First 10 prime numbers are : \n");
		assignment11.printPrimeNumbersRange(10);
		assignment11.checkSumMoreThan100();
	}
} 
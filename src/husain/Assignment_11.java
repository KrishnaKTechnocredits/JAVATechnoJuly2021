package husain;

public class Assignment_11 {
	int count;
	
	void numbersSumToHundred() {
		int sumCount = 0;
		int sum = 0;
		int num = 1;
		while(sum<=100) {
			sum = sum + num;
			num++;
			sumCount++;
		}
		System.out.println("The count of numbers that sum to 100 is: " + sumCount);
	}
	
	void printPrimeNumbers(int endRange) {
		int index = 2;
		System.out.println("The first "+endRange+" prime numbers are: ");
		while(count != endRange) {
			identifyPrimeNumbers(index);
			index++;
		}
		
	}
	
	void identifyPrimeNumbers(int number) {
		boolean status = true;
		for(int index = 2; index<=number-1; index++) {
			if(number % index == 0) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.print(number+" ");
			count++;
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_11 obj = new Assignment_11();
		obj.numbersSumToHundred();
		obj.printPrimeNumbers(10);
		
		
	}

}

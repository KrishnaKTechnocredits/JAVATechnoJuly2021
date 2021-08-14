package shantanu.assignment11;

public class PrintPrimeNumbers {
	void printNPrimeNumbers(int number) {
		boolean flag;
		int count = 1;
		int num = 2;
		while(count <= number) {
			flag = true;
			for(int index = num-1; index > 1; index--) {
				if(num % index == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(num+ " is prime number.");
				count++;
			}
			num++;
		}
		
	}
	
	public static void main(String[] args) {
		PrintPrimeNumbers printPrimeNumbers = new PrintPrimeNumbers();
		printPrimeNumbers.printNPrimeNumbers(10);
	}
}

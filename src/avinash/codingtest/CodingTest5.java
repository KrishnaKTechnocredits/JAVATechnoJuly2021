package avinash.codingtest;

public class CodingTest5 {

	int count =0,sum;

	void isPerfectNumber(int number) {
		sum =0;
		for (int index = 1; index <number ; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (number == sum) {
			count++;
			System.out.println(number);
		}
	}
		
	void printFirstPerfectNumber(int num) {
		int number = 1;
		while (count <= num) {
			isPerfectNumber(number);
			number++;
		}

	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingTest5 codingtest5 = new CodingTest5();
		codingtest5.printFirstPerfectNumber(5);

	}

}

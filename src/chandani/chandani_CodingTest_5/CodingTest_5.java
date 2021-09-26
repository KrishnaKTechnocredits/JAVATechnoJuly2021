package chandani.chandani_CodingTest_5;

public class CodingTest_5 {
	
	int n;
	int count = 0;
	
	void getPerfectNumber(long num) {
		
		long sum = 0;
		for(int index = 1; index <= num/2; index++) {
			if(num % index == 0) {
			sum = sum + index;
			}
		}
		
		if(sum == num) {
			count++;
			System.out.println(sum);
		}
	}

	void display5PerfectNumbers(int n) {
		
		long perfectNumber = 1;
		while (count <= n){	
			getPerfectNumber(perfectNumber);
			perfectNumber++;
		}		
	}
	public static void main(String[] args) {
		CodingTest_5 codingTest5 = new CodingTest_5();
		codingTest5.display5PerfectNumbers(5);		
	}
}


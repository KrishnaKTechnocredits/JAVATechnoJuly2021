package chirag.codingTest;

public class FindFirstFivePerfectNumbers {
	
	void getFirstFivePerfectNumber() {
		int count =0;
		int number =1;
		int sum;
		while (count < 5) {
			sum = 0;
			for(int index=1;index < number;index++) {
				if(number % index ==0)
					sum = sum + index;
			}
			if(number == sum) {
				System.out.println(number);
				count++;
			}
			number++;
			}
		}
	public static void main(String[] args) {
		FindFirstFivePerfectNumbers findFirstFivePerfectNumbers = new  FindFirstFivePerfectNumbers();
		findFirstFivePerfectNumbers.getFirstFivePerfectNumber();
	}

}

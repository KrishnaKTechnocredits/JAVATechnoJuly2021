package bharat.assignment;

public class Assignment_11 {

	int sum;
	int count;
	int cntPrime;
	
	void primeNumber(int number) {
		boolean status = true;
		int index = 2;
		
		while(index < number) {
			if(number % index == 0) {
				status = false;
				
				break;
			}
		index++;
		
		}if(status) {
			System.out.println(number+" is prime Number");
			cntPrime++;
		}
	}
	
	void getPrimeNumber(int value) {
		int index = 1;
		while(cntPrime < value) {
			primeNumber(index);
			index++;
		}
	}
	
	void sumOf() {
		int index = 1;
		while (sum < 100) {
			sum = sum + index;
			index++;
			count++;
		}
	System.out.println("Required number to generate sum more than 100 is:-- "+count);
	}	
	
	public static void main(String[] args) {
		Assignment_11  A_11 =new Assignment_11();
		A_11.getPrimeNumber(10);
		
		Assignment_11 Ass_11 = new Assignment_11();
		Ass_11.sumOf();
	}
	
	
}

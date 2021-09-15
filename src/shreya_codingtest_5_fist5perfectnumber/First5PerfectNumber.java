package shreya_codingtest_5_fist5perfectnumber;

public class First5PerfectNumber {
	int sum=0;
    boolean getPerfectNumber(int number) {
    	int sum = 0;
		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number)
			return true;
		else
			return false;
	}
    public static void main(String[] args) {
		First5PerfectNumber first5PerfectNumber=new First5PerfectNumber();
		int count = 0;
		int number = 2;
		System.out.println("First 5 Perfect Numbers are :- ");
		while (count <= 7) {
			if (first5PerfectNumber.getPerfectNumber(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}

	}

}

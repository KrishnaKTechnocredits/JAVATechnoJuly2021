package Rasika_assignment_30;

public class Program4 {
	
	void isPerfectNumber(int input) {
		int temp = input;
		int divisors = 0;
		for(int index = 1; index < input; index++) {
			if(temp % index == 0) {
				divisors = divisors + index;
			}
		}
		if(divisors == input)
			System.out.println(input+" Its a perfect number");
		else
			System.out.println(input+" Its not a perfect number");
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		program4.isPerfectNumber(28);
		program4.isPerfectNumber(29);
		
	}
}

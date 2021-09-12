package himanshu_Common_Programs;

public class Perfect_Number {

	void checkPerfectNumber(int num) {
		int sum = 1;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
	}

	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 60;
		
		Perfect_Number assignment31_1 = new Perfect_Number();
		assignment31_1.checkPerfectNumber(num1);
		assignment31_1.checkPerfectNumber(num2);
	}
}

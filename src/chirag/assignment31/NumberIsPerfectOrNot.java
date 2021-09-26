package chirag.assignment31;

public class NumberIsPerfectOrNot {
		
	void isPerfectNumber(int num) {
		int number = num;
		int i = 1;
		int sum = 0;
		
		while (i <= number /2) {
			if(number % i == 0) {
				sum = sum +i;
			}
			i++;
		}
		if(sum == num) {
			System.out.println(number +" : is a perfect number");
		}
		else {
			System.out.println(number+" : is not a perfect number");
		}
	}
		public static void main(String[] args) {
			NumberIsPerfectOrNot isPerfectOrNot = new NumberIsPerfectOrNot();
			int number = 28;
			isPerfectOrNot.isPerfectNumber(number);
			number = 50;
			isPerfectOrNot.isPerfectNumber(number);
		}
	}

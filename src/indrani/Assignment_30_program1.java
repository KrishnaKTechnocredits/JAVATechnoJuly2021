package indrani;

public class Assignment_30_program1 {
	
	int reverseNumber(int number) {
		int reverse=0, remainder;
		while(number > 0) {
			remainder = number%10;
			reverse = (reverse*10) + remainder;
			number = number/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Assignment_30_program1 program1 = new Assignment_30_program1();
		int num = 1932;
		System.out.println("Reverse of the given number is: " + program1.reverseNumber(num));
	}
}

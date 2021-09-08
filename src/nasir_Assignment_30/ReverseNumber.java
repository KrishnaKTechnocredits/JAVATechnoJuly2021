package nasir_Assignment_30;

public class ReverseNumber {
	int getReverseOfNumber(int num) {
		int remainder = 0;
		int reverseNumber = 0;
		while(num > 0) {
			remainder = num % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			num = num/10;
		}
		return reverseNumber;
	}
	void displayNumberInReverse(int num) {
		System.out.println("Reverse of "+num+" is:"+getReverseOfNumber(num));
	}

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.displayNumberInReverse(1932);

	}

}

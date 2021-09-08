package margi.Assignment_30;

public class Assignment_30_1 {
	
	//reverse a given number
	int reverseNumber(int number) {
		int revNum=0, remainder;
		while(number > 0) {
			remainder = number%10;
			revNum = (revNum*10) + remainder;
			number = number/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		Assignment_30_1 assignment_30_1 = new Assignment_30_1();
		int num = 1932;
		System.out.println("Reverse number is: " + assignment_30_1.reverseNumber(num));
	}
}

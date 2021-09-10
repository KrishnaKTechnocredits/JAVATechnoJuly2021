package akshay;

public class Assignment30_1 {
	
	int getReverseNumber(int num) {
		int rnum = 0;
		int sum = 0;
		while(num > 0) {
			rnum = num % 10;
			sum = sum * 10 + rnum;
			num = num /10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment30_1 assignment30_1 = new Assignment30_1();
		int input = 1932;
		System.out.println("Reverse number of given number " +input+ " is: " +assignment30_1.getReverseNumber(input));
	}
}

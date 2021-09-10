package neha.assignment_30;

/*Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/
public class ReverseNumPg1 {
	int reverseNum(int num) {
		int tempNum = num;
		int revNum = 0;
		while (tempNum > 0) {
			revNum = tempNum % 10 + revNum * 10;
			tempNum = tempNum / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		ReverseNumPg1 reverseNumPg1 = new ReverseNumPg1();
		int num = 45678;
		System.out.println("Reverse number is " + reverseNumPg1.reverseNum(num));
	}
}

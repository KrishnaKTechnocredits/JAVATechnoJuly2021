package chirag.assignment30;

public class ReverseNumber {
	
	void numberReverse(int num) {
		int number= num;
		int remainder=0;
		int sum=0;
		while(number > 0) {
			remainder=number % 10;
			sum = sum * 10 + remainder;
			number=number /10;
		}
		System.out.println("Given Number : "+num+"\nAfter reverse : "+sum);		
	}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		int num = 1234;
		reverseNumber.numberReverse(num);
	}

}

package varun.varun_different_programs;

public class ReverseANumber {
	
	void numberReverse(int num) {
		int revNum=0;
		int actualNum = num;
		while(num>0) {
			int remainder = num%10;
			revNum = revNum*10+remainder;
			num = num/10;
		}
		System.out.println("Reverse of given number " +actualNum+ " is " +revNum);
	}
	
	public static void main(String[] args) {
		ReverseANumber reverseANumber = new ReverseANumber();
		reverseANumber.numberReverse(1932);
	}
}

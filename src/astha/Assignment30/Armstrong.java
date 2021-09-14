package astha.Assignment30;

public class Armstrong {

	void getReverseNumber(int inputNum) {
		int remainder = 0, temp = inputNum;
		String output = "";
		while(inputNum > 0) {
		remainder = inputNum%10;
		output += remainder;
		inputNum = inputNum/10;
		}
		System.out.println("The reverse of "+ temp + " is : "+ output);
	}
	
	void checkArmstrongNumber(int input) {
		String output = ""+input;
		int sum =0;
		for(int index=0; index<output.length(); index++) {
			int num = Character.getNumericValue(output.charAt(index));
			sum += num*num*num;
		}
		if(sum == input)
			System.out.println(input + " is an armstrong number");
		else 
			System.out.println(input + " is not an armstrong number");
	}
	
	void checkNumberPalindrome(int number) {
		int remainder = 0, sum = 0, temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (sum == temp)
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");

	}
	
	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		armstrong.getReverseNumber(1932);
		armstrong.checkArmstrongNumber(153);
		armstrong.checkArmstrongNumber(294);
		armstrong.checkNumberPalindrome(12321);
		armstrong.checkNumberPalindrome(33221);
	}
}

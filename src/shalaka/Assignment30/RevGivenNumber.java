/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391

Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.*/
package shalaka.Assignment30;

public class RevGivenNumber {
	int getRevNumber(int num) {
		int revNum=0;
		while(num>0) {
			revNum=revNum*10+num%10;
			num=num/10;
		}
		return revNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1932;
		RevGivenNumber revGivenNumber = new RevGivenNumber();
		int revNum=revGivenNumber.getRevNumber(number);
		System.out.println("Reverse Number of "+number+" is: "+revNum);
	}

}

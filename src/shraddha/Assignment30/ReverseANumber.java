/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/

package shraddha.Assignment30;

public class ReverseANumber {
	public static void main(String[] args) {
		int inputNumber = 1932;
		int revNumber = 0;
		System.out.println("Input number is :- " + inputNumber);
		while (inputNumber > 0) {
			revNumber = revNumber * 10 + inputNumber % 10;
			inputNumber = inputNumber / 10;
		}
		System.out.println("Reverse number is :- " + revNumber);
	}

}

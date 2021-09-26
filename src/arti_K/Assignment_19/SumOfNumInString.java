/* program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70  */

package arti_K.Assignment_19;

public class SumOfNumInString {
	
	int sumOfNum(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for(int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "10 10 20 30";
		SumOfNumInString sum = new SumOfNumInString();
		
		System.out.println("Sum of Numbers in String is : "+sum.sumOfNum(input));
	}
}

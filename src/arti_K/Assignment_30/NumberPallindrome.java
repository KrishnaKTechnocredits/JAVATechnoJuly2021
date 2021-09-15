/*	Program 3: Verify given number is an palindrome  number.
input : 12321
output : 12321 is an palindrome  number
 */

package arti_K.Assignment_30;

public class NumberPallindrome {

	boolean isPallindrome(int numberInput){
		int num = numberInput;
		int revNumber = 0;
		
		while(num > 0){
			int remainder = num % 10;
			revNumber = revNumber * 10 + remainder;
			num = num/10;
		}
		
		if(revNumber == numberInput)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		
		NumberPallindrome num = new NumberPallindrome();
		
		int[] arr = {12321,123};
		
		for(int index = 0; index < arr.length; index++) {
			boolean flag = num.isPallindrome(arr[index]);
			
			if(flag)
				System.out.println("Given number "+arr[index]+" is palindrome.");
			else
				System.out.println("Given number "+arr[index]+" is Not palindrome.");
		}
	}
}

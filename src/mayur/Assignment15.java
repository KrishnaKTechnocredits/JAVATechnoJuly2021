/*
 * *program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
arr[1] = "Techno";
arr[2] = "Nidhi";
arr[3] = "Ankit";

output : 2

program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){}

Hint : charAt method of String class helps to retrieve character on given index


program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.
int[] arr = {12,2,13,9}
hint : 22 - 14 = 8
output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
 */

package mayur;

public class Assignment15 {

	void diffOfEvenAndOddLength(String[] arr) {
		int diff = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				evenSum = evenSum + arr[i].length();
			} else {
				oddSum += arr[i].length();
			}

		}
		if (evenSum > oddSum) {
			diff = evenSum - oddSum;
			System.out.println("Difference of " + evenSum + " and " + oddSum + " is " + diff);
		} else {
			diff = oddSum - evenSum;
			System.out.println("Difference of " + oddSum + " and " + evenSum + " is " + diff);
		}

	}

	void middleChar(String[] arr) {
		char mcharChar = ' ';
		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			if (name.length() % 2 == 0) {
				mcharChar = name.charAt(name.length() / 2 - 1);
				System.out.println("Middle character of word " + name + " : " + mcharChar);
			} else {
				mcharChar = name.charAt(name.length() / 2);
				System.out.println("Middle character of word " + name + " : " + mcharChar);
			}
		}

	}
	void diffSumOfEvenAndOddNum(int [] arr) {
		int diff;
		int evenSum =0;
		int oddSum =0;
		for(int index=0; index<arr.length;index++) {
			if(arr[index]%2 == 0) {
				evenSum += arr[index];
			}else {
				oddSum += arr[index];
			}
			
		}if (evenSum>oddSum) {
			diff = evenSum - oddSum;
			System.out.println("Difference of " + evenSum + " and " + oddSum + " is " + diff);
		}else {
			diff = oddSum - evenSum;
			System.out.println("Difference of " + oddSum + " and " + evenSum + " is " + diff);
		}
			
		
		
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		System.out.println("######## Program 1 ########");
		String input[] = { "Maulik", "Techno", "Nidhi", "Ankit" };
		assignment15.diffOfEvenAndOddLength(input);
		System.out.println("######## Program 2 ########");
		String[] str = { "hello", "techno", "credits" };
		assignment15.middleChar(str);
		System.out.println("######## Program 3 ########");
		int[] arr = {12,2,13,9};
		assignment15.diffSumOfEvenAndOddNum(arr);
		int[] arr1 = {13,22,10,3};
		assignment15.diffSumOfEvenAndOddNum(arr1);
		

	}

}

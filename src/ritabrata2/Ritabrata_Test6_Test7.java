/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 
Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
output : 1
hint : 6,23,25 */


package ritabrata2;

import java.util.Arrays;

public class Ritabrata_Test6_Test7 {
	void findFirstNonRepeatingCharecter(String input) {
		for(int index=0; index<input.length(); index++) {
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index))) {
				System.out.println("The first non-repeating charecter is: "+input.charAt(index));
				break;
			}	
		}
	}
	
	void findFirstNonRepeatingWord(String input) {
		for(int index=0; index<input.length();index++) {
			String[] arr= input.split(" ");
			if(input.indexOf(arr[index])==input.lastIndexOf(arr[index])) {
				System.out.println("The first non-repeating word is: "+arr[index]);
				break;
			}		
		}
	}
	
	void countIncreasingTriplets(int[] input) {
		int count=0;
		for(int i=0; i<input.length-2;i++) {
			int n= input[i];
			if(n< input[i+1] && input[i+1]<input[i+2]) {
				System.out.println("The triplet is :"+n+" ,"+input[i+1]+" ,"+input[i+2]);
				count++;
			}
		}
		System.out.println("Total number of triplets: "+count);
	}

	public static void main(String[] args) {
		Ritabrata_Test6_Test7 test = new Ritabrata_Test6_Test7();
		test.findFirstNonRepeatingCharecter("technocredits");
		System.out.println("-------------------------------------------");
		String str= "hi this is techno gm credits this hi is";
		test.findFirstNonRepeatingWord(str);
		System.out.println("-------------------------------------------");
		int[] arr= {10,9,11,6,23,25,22,66,34};
		test.countIncreasingTriplets(arr);
	}

}

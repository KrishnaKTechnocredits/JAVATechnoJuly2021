/*
 program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1
 */
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;

public class Assignment_20_4 {

	int findLetterFreq(String input, char letter) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==letter)
				count++;	
		}
		return count;	
	}
	void findFrequency(String inputString) {
		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.indexOf(inputString.charAt(index)) != inputString.lastIndexOf(inputString.charAt(index))
					&& index == inputString.indexOf(inputString.charAt(index)))
				System.out.println(inputString.charAt(index) + "->" + findLetterFreq(inputString, inputString.charAt(index)));
		}
	
	}
	public static void main(String a[]) {
		Assignment_20_4 assignment_20_4=new Assignment_20_4();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a String ");
		String strInput=sc.next();
		assignment_20_4.findFrequency(strInput);
	}
}

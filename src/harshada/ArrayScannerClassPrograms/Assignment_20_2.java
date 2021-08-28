/* 
 program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1
 */
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;

public class Assignment_20_2 {
	
	int findLetterFreq(String input, char letter) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==letter)
				count++;	
		}
		return count;	
	}
	void findFrequency(String inputStr) {
		for (int index = 0; index < inputStr.length(); index++) {
			if (index == inputStr.indexOf(inputStr.charAt(index)))
				System.out.println(inputStr.charAt(index) + "->" + findLetterFreq(inputStr, inputStr.charAt(index)));
		}
	}

	public static void main(String a[]) {
		Assignment_20_2 assignment_20_2=new Assignment_20_2();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a String ");
		String strInput=sc.next();
		assignment_20_2.findFrequency(strInput);
	}
}

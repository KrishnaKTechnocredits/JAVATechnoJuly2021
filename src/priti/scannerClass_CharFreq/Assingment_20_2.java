package priti.scannerClass_CharFreq;

import java.util.Scanner;

public class Assingment_20_2 {
	int getFreqOfChar(String input, char ch) {
		int cnt=0;
		for (int index=0; index<input.length();index++) {
			if(ch==input.charAt(index)) {
				cnt++;
			}	
		}
		System.out.println("Frequency of " +ch +" in Word " + input + " is : " +cnt);
		return cnt;		
	}
	
	void getFreqOfEachChar(String str) {
		for (int index=0; index<str.length();index++) {
			if (index == str.indexOf(str.charAt(index))) {
				getFreqOfChar(str, str.charAt(index));
			}
		}
	}
		
	public static void main(String[] a) {
		Assingment_20_2 assingment_20_2 = new Assingment_20_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the word here:");
		String input = scanner.next();
		assingment_20_2.getFreqOfEachChar(input);
	}	
}

/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1
*/
package priti.scannerClass_CharFreq;

import java.util.Scanner;

public class Assingment_20_3 {
	void CharFreq(String str, char ch) {
		for (int index=0; index<str.length();index++) {
			if (ch==str.charAt(index)) {
			}
		}
		System.out.println(ch);
	}
	
	void pritnUniquechar(String input) {
		for (int index=0; index<input.length();index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				CharFreq(input,input.charAt(index));
			}	
		}	
	}
		
	public static void main(String[] a) {
		Assingment_20_3 Assingment_20_3 = new Assingment_20_3();
		Scanner scanner= new Scanner (System.in);
		System.out.println("Please enter Word here:");
		String str = scanner.next();
		System.out.println("Unique charcters in given strig "+str+ " are:");
		Assingment_20_3.pritnUniquechar(str);
		System.out.println("Please enter Word here:");
		String input = scanner.next();
		System.out.println("Unique charcters in given strig "+input+ " are:");
		Assingment_20_3.pritnUniquechar(input);
	}
}

/*program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h
*/
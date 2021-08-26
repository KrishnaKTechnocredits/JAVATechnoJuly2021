package priti.scannerClass_CharFreq;

import java.util.Scanner;

public class Assingment_20_4 {
	int getFreqOFChar(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			if( ch==input.charAt(index)){
				count++;
			}
		}
		return count;
	}	
	void printDuplicateChar(String str) {
		for(int index=0; index<str.length();index++) {
		char ch = str.charAt(index);
		int cnt= getFreqOFChar(str, str.charAt(index));
			if(cnt>1 &&(index==str.indexOf(str.charAt(index)))) {
			System.out.println(ch +" -> "+cnt);
		
			}
		}	
	}
	
	public static void main(String[] a) {
		Assingment_20_4 assingment_20_4 = new Assingment_20_4();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter the string here:");
		String str= scanner.next();	
		assingment_20_4.printDuplicateChar(str);	
	}			
}	

/*program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1
*/
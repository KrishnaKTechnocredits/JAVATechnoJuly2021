/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1*/

package shalaka.ArrayPrograms;

import java.util.Scanner;

public class FreqOfEachChar_Assignment20 {
	int getFreqCharOf(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(ch==input.charAt(index))
				count++;
		}
		System.out.println("In word "+input+" frequency of "+ ch +" is: "+count);
		return count;
		
	}
	void getFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			if(index==input.indexOf(input.charAt(index)))
			getFreqCharOf(input,input.charAt(index));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqOfEachChar_Assignment20 freqOfEachChar_Assignment20= new FreqOfEachChar_Assignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input=scanner.next();
		freqOfEachChar_Assignment20.getFreqOfEachChar(input);
		
		scanner.close();

	}

}

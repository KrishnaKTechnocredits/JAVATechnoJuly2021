package chirag.assignment20;

import java.util.Scanner;

public class CountCharInString {
	
		int getCharCount(String input, char ch) {
			int count=0;
			
			for(int index=0; index < input.length();index++) {
				if(input.charAt(index) == ch) {
				count++;
				}
			}
			System.out.println(ch+" : "+count);
			return count;
		}
		void printFreqOfEachChar(String input) {
			for(int index=0; index <input.length();index++) {
				if(index == input.indexOf(input.charAt(index)))
					getCharCount(input, input.charAt(index));
			}
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter String : ");
			String temp = scanner.next();
			CountCharInString countCharInString = new CountCharInString();
			countCharInString.getCharCount(temp, 'e');	
		}
	}
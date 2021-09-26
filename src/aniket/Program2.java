package aniket;
import java.util.Scanner;
public class Program2 {
	
		void getFrequencyOfChar(String input, char ch) {
			int count = 0;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == ch) {
					count++;
				}
			}
			System.out.println("In String " + input + " occurance of character " + ch + " is : " + count);
		}

		void getFrequencyOfEachChar(String input) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) == index)
					getFrequencyOfChar(input, ch);
			}
		}

		public static void main(String[] args) {
			Program2 program_2 = new Program2();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String to which frequency of each character need to find ");
			String word = sc.next();
			program_2.getFrequencyOfEachChar(word);
		}
	}


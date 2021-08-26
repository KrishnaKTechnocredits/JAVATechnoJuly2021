package shweta_Dharmadhikari.string_count;

import java.util.Scanner;

public class FindMinimumWordLength {
	 String getMaxWordFromString() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter String : ");
		 String input = scan.nextLine();
		 String output[] = input.split(" ");
		 String minWord = output[0];
		 
		for (int index = 0; index < output.length;index++) {
			 if (minWord.length()>output[index].length()) {
				 minWord=output[index];
			 }
		 }
		 scan.close();
		 return minWord;
	 }
	 
	public static void main(String[] args) {
		FindMinimumWordLength findMinimumWordLength = new FindMinimumWordLength();
		System.out.println("Minimum length Word in given string is : "+findMinimumWordLength.getMaxWordFromString());
	}
}

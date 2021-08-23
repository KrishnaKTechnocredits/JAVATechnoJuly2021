package parthav.parthavD_Assignment19;

import java.util.Scanner;

public class FindWordsInAString {
	
	void findWords (String str) {
		String[] strArray = str.split(" ");
		System.out.println("The number of words in the passed string is: " + strArray.length);
	}
	
	public static void main(String[] args) {
		
		System.out.println("------------------Program1--------------------------------");
		FindWordsInAString newObject = new FindWordsInAString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence in which you would like to find the number of words: ");
		String str = sc.nextLine();
		newObject.findWords(str);
		sc.close();
		System.out.println("------------------Program2--------------------------------");
		FindMaximumWordLength newObject2 = new FindMaximumWordLength();
		System.out.println("The word with maximum length in the given statement is: ");
		newObject2.findBiggestWord("good morning technocredits hi hello");
		System.out.println("------------------Program3--------------------------------");
		FindMinimumWordLength newObject3 = new FindMinimumWordLength();
		System.out.println("The word with minimum length in the given statement is: ");
		newObject3.findSmallestWord("good morning technocredits hi hello");
		System.out.println("------------------Program4--------------------------------");
		SumOfAllNumbersInStatement newObject4 = new SumOfAllNumbersInStatement();
		newObject4.printSumOfAllNumbers("10 10 20 30");
		
		
		
		
	}

}

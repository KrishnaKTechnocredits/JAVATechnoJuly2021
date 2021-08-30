package parthav.parthavD_Assignment24;

import java.util.Scanner;

public class CountMaxRepeatingWord {
	
	void getMaxCountOfRepeatingWord (String inputWord) {
		String [] inputArr = inputWord.split(" ");
		int maxFrequency = 0;
		String maxRepeatingString = "";
		
		for (int index = 0;index < inputArr.length;index++) {
			int countOfRepetition = 0;
			for (int innerIndex = 0;innerIndex < inputArr.length;innerIndex++) {
				if (inputArr[index].equals(inputArr[innerIndex])) {
					countOfRepetition++;
				}
			}
			if (countOfRepetition > maxFrequency)
			{
				maxFrequency = countOfRepetition;
				maxRepeatingString = inputArr[index];
			}
				
			
		}
		
		System.out.println("Max repeating string: " + maxRepeatingString + " with frequency: " + maxFrequency);
	}
	
	public static void main(String[] args) {
		
		CountVowelsInString newObject = new CountVowelsInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in which you want to find the count of vowels: ");
		String inputStr = sc.next();
		System.out.println(
				"The count of vowels in the string " + inputStr + " is " + newObject.getVowelsCountInString(inputStr));
		System.out.println("Enter a string in which you want to find the count of vowels: ");
		inputStr = sc.next();
		newObject.getVowelsCountInString(inputStr);
		System.out.println(
				"The count of vowels in the string " + inputStr + " is " + newObject.getVowelsCountInString(inputStr));
		sc.close();
		CountMaxRepeatingWord newObject1 = new CountMaxRepeatingWord();
		newObject1.getMaxCountOfRepeatingWord("Hi Hello Hi Techno Hello Hi");
		
		
	}

}

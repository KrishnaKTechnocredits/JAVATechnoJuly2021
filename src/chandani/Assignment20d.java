package chandani;

import java.util.Scanner;

public class Assignment20d {
	
	int GetFreqCharCount(String input,char ch){
		int count = 0;
		for(int index = 0; index < input.length(); index++){
			if(input.charAt(index) == ch){
			count++;
			}
		}
		System.out.println("Frequency of character " + ch + " in the input String " + input + " is : " + count);
		return count;
	}
	
	void GetFreqEachCharCount(String input){
		for(int index = 0; index < input.length(); index++){
			if(index == input.indexOf(input.charAt(index))){
				GetFreqCharCount(input, input.charAt(index));
			}
		}
	}
	
	public static void main(String[] args){
		Assignment20d assignment20d = new Assignment20d();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String str = scanner.nextLine();
		assignment20d.GetFreqEachCharCount(str);
	}
}

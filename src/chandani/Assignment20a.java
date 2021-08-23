package chandani;

import java.util.Scanner;

class Assignment20a{

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
	
	public static void main(String[] args){
		Assignment20a assignment20a = new Assignment20a();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String input = scanner.nextLine();
		System.out.println("Enter a char for which you want to find frequency for : ");
		char ch = scanner.nextLine().charAt(0);
		assignment20a.GetFreqCharCount(input, ch);	
	}


}
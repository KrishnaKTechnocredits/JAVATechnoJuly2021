package gauravk.Assignment_24;
/*
 * Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
 */
//import java.util.Scanner;


public class PickMaxRepeatingWordsInStringV2 {
	//The program for displaying last max repeating word if there is a tie between two words.	
	void pickMaxFrequency(String s) {
		String maxRepeatWord = "";
		int maxCount =0;
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++) {
			int count = 1;
			for(int j=i+1; j<s1.length; j++) {
				if(s1[i].equals(s1[j]))
					count++;
				if(count>=maxCount) { //here the condition is '>=' which displays last word during tie situation.
					maxCount = count;
					maxRepeatWord = s1[i];
				}
			}
		}
		System.out.println("The maximum repeating word is: "+maxRepeatWord+" and it repeated "+maxCount+" times.");
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String str = "Hi Hello Hi Techno Hello Hi Hello";
		System.out.println("Type the sentence of your choice: "+str);
		//String str = sc.nextLine();
		new PickMaxRepeatingWordsInStringV2().pickMaxFrequency(str);		
	}
}
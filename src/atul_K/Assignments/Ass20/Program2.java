package atul_K.Assignments.Ass20;

import java.util.Scanner;

public class Program2 {
	
	public static void main(String [] args) {
		Program2 p2 = new Program2();
		p2.getFreqOfAllChar();
	}

	void getFreqOfAllChar() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the word");
		String word = s2.next().toUpperCase();
		for (int index =0; index < word.length(); index++) {
			int cnt = 0;
			if(index == word.indexOf(word.charAt(index))){
				for (int ind = index;ind <word.length();ind++) {
					if (word.charAt(index)== word.charAt(ind)) {
						cnt++; 
					}
				}
				System.out.println(word.charAt(index)+"-->"+cnt);
			}
		}
	}
}

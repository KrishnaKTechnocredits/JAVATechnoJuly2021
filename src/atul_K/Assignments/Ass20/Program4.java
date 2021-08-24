package atul_K.Assignments.Ass20;

import java.util.Scanner;

public class Program4 {

	public static void main(String [] args) {
		Program4 p4 = new Program4();
			p4.getFreqOfDupChar();
	}

	void getFreqOfDupChar() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the word");
		String word = s2.next().toUpperCase();
		for (int index =0; index < word.length(); index++) {
			int cnt = 0;
			if (word.indexOf(word.charAt(index)) != word.lastIndexOf(word.charAt(index))){
				if (word.indexOf(word.charAt(index)) == index) {
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
}

package atul_K.Assignments.Ass20;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		Program1  p1 = new Program1();
		System.out.println(p1.getFrequencyofChar());
	}

	int getFrequencyofChar() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the word");
		String word= s1.next().toLowerCase();
		s1.nextLine();
		System.out.println("Enter the character");
		char ch = s1.next().toLowerCase().charAt(0);
		int cnt = 0;
		for(int index=0; index < word.length();index++) {
			if (word.charAt(index)== ch) {
				cnt++;
			}		
		}
		return cnt;
	}
}

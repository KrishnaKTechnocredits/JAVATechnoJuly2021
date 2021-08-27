package atul_K.Assignments.Ass20;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Program3 p3 = new Program3();
		p3.getuniqueChar();
	}
	void getuniqueChar() {
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the word");
		String word = s3.next().toUpperCase();
		
		for (int index =0; index < word.length(); index++) {
			if (word.indexOf(word.charAt(index)) == word.lastIndexOf(word.charAt(index)))
				System.out.println(word.charAt(index));
			}
		}
	}

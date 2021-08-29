package akshay;

import java.util.Scanner;

public class DuplicateChar {
	void getDuplicateChar(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count =0;
			for(int index1=0; index1<str.length(); index1++) {
				if(str.charAt(index1) == ch && index == str.indexOf(ch))
					count ++;
			}
			if(count>0 && count!=1)
				System.out.println(str.charAt(index) + " -> " + count);
		}
	}

	public static void main(String[] args) {
		DuplicateChar duplicatechar = new DuplicateChar();
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		duplicatechar.getDuplicateChar(word);
	}
}

package akshay;

import java.util.Scanner;

public class FindVowels {
	
	void findVowels(String str) {
		char ch = 0;
		boolean a = true;
		boolean e = true;
		boolean i = true;
		boolean o = true;
		boolean u = true;
		System.out.print("Vowels are: ");
		for(int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			switch(ch){
				case 'a':
					if(a) {//to avoid to print the vowel again for same string
						System.out.print("a");
						a = false;
					}
					break;
				case 'e':
					if(e) {
						System.out.print("e ");
						e = false;
					}
					break;
				case 'i':
					if(i) {
						System.out.print("i ");
						i = false;
					}
					break;
				case 'o':
					if(o) {
						System.out.print("o ");
						o = false;
					}
					break;
				case 'u':
					if(u) {
						System.out.print("u ");
						u = false;
					}
					break;
			}
		}
	}
	
	public final static void main(String[] args) {
		FindVowels vowels = new FindVowels();
		System.out.print("Please enter the string: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		vowels.findVowels(word);
	}
}
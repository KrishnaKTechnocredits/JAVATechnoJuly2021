/*
 Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno
 */
package atul_K.Assignments.ProgramTest6;

public class ProgramTest6 {
	void firstNonRepeatingChar(String word) {
		int cnt=0;
			for(int index=0;index< word.length()&& cnt< 1;index++) {
				if (word.lastIndexOf(word.charAt(index)) == word.indexOf(word.charAt(index))) {
					System.out.println(word.charAt(index));
					cnt++;
				}	
			}
	}
	
	void firstNonRepeatingWord(String word) {
		String[] arr = word.split(" ");
		for(int outerindex=0;outerindex < arr.length;outerindex++) {
			int freq = 1;
			for(int index=1;index <arr.length;index++) {
				if(index != outerindex) {
					if(arr[outerindex].equals(arr[index]))
						freq++;	
				}
			}
			if(freq == 1) {
				System.out.println(arr[outerindex]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String word = "technocredits";
		String word1 = "hi this is techno gm credits this hi is";
		ProgramTest6 t6 = new ProgramTest6();
		t6.firstNonRepeatingChar(word);
		t6.firstNonRepeatingWord(word1);
	}
}

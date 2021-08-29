/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1
 */

package arti_K.Assignment_20;

public class FreqOfAllChar {

	void getAllChar(String str) {
		
		for(int index=0; index < str.length(); index++) {
			char ch = str.charAt(index);
				
			if(str.indexOf(ch) == index) {
				int count = 0;
				for(int innerindex = 0; innerindex < str.length(); innerindex++) {
					if(str.charAt(innerindex) == ch)
						count++;
				}
				System.out.println("Frequency of charcter "+ch+" in given string "+str+" is "+count+" times.");
			}
		}
	}

	public static void main(String[] args) {
		FreqOfAllChar freq = new FreqOfAllChar();
		freq.getAllChar("hello");
	}
}

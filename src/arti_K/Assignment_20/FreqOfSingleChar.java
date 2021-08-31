/*  Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2  */

package arti_K.Assignment_20;

public class FreqOfSingleChar {
	
	void getFreqOfChar(String str,char ch) {
		int count = 0;
		for(int index=0; index < str.length(); index++) {
			if(str.charAt(index) == ch)
				count++;
		}
		System.out.println("In word " +ch+ " frequency of character " +ch+ " is : "+count);
	}
	public static void main(String[] args) {
		new FreqOfSingleChar().getFreqOfChar("technocredits", 'e');
	}
}

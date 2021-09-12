/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 
This took less than 10 min 
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno

*/
package bhakti_CodingTest;

import java.util.Arrays;

public class Test_6 {

	//Program 1: Find first non repeating character from a word. [expected : 10 mins]
	
	void togetnonrepetingChar(String input) {
		 
		
		for (int i=0; i< input.length(); i++) {
			char ch=input.charAt(i);
			if (input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}	
	}
	
	//Program 2: Find first non repeating word from a given String. [expected : 15 mins]
	
	void firstNonRepeatingWord(String arr) {
		String[] input= arr.split(" ");
		int i,j,count;
		i=0;
		
		while (i<input.length){
			count=0;
			for (j=0;j<input.length;j++) {
				if(input[i].equals(input[j]) )
					count++;
			}
			if(count==1)
				break;
			i++;
		}
		System.out.println(input[i]); 
	}	
	
	 
	
	

	public static void main(String[] jj) {
		 String input = "hi this is techno gm credits this hi is";
		
		Test_6 test_6= new Test_6();
	 
		test_6.togetnonrepetingChar("technocredits");
		test_6.firstNonRepeatingWord(input);
		
				 
	}
	
	
	
}

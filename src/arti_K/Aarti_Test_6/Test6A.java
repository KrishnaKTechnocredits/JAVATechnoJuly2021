/*	Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

 */
package arti_K.Aarti_Test_6;

public class Test6A {
	
	void findFirstNonRepeatedChar(String str){
		int count = 0;
		char ch = ' ';
		for(int index = 0; index < str.length(); index++){
			if(str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))){
				ch = str.charAt(index);
				count++;
			}
				
			if(count == 1)
				break;
		}
		System.out.println("First non repeating character from a given word is : "+ch);
	}
	
	public static void main(String[] args){
		String input = "technocredits";
		new Test6A().findFirstNonRepeatedChar(input);
	}
}

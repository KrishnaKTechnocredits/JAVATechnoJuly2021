/* Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 
Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25
*/


package harshada.ProgrammingTests;

public class Test_6 {

	void p1_getNonRepeatingChar() {
		String input="technocredits";

		char ch = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.lastIndexOf(input.charAt(index))==index) {
				ch = input.charAt(index);
				break;
			}
		}

		System.out.println("The first non-repeating character in '"+input +"' is =  "+ch);
	}
	
	void p2_getNonRepeatingWordFromString(String input) {
		String strArray[]= input.split(" ");
		//input : hi this is techno gm credits this hi is 
		//output : techno
		for(int index = 0; index < strArray.length; index++) {
			if (input.indexOf(strArray[index]) == input.lastIndexOf(strArray[index])) { 
				// if first and last index are same then string is non repeating ex techno--> firstindex=3, lastindex=3
				System.out.println("First non repeatative word is: " + strArray[index]);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_6 test_6=new Test_6();
		System.out.println("Program 1 output ");
		test_6.p1_getNonRepeatingChar();
		System.out.println("\nProgram 2 output ");
		String str="hi this is techno gm credits this hi is";
		test_6.p2_getNonRepeatingWordFromString(str);
	}

}

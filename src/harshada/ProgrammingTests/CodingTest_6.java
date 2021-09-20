/* Test - 6 : 10th Sep'2021
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno
*/
package harshada.ProgrammingTests;

public class CodingTest_6 {
	
	void p1_getFirstNonRepChar(String input) {
		//String input="harhadamandhare";
		
		for(int index=0; index < input.length(); index++) {
			char ch=input.charAt(index);
				if(input.indexOf(ch)==input.lastIndexOf(ch)){
					System.out.println("First Non Repeating Character is : "+ ch);
					break;
			}
		}	
	}
	
	String p2_getFirstNonRepWord(String str) {
		
		
		String output[]= str.split(" ");
		
		for(int index=0; index < output.length; index++) {
			int count=0;
			for(int innerIndex=index+1; innerIndex < output.length; innerIndex++) {
				if(output[index].equals(output[innerIndex])) {
					count++;
				}
			}
			if(count==0)
				return output[index];
		}	
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingTest_6 codingTest6=new CodingTest_6();
		String str="technocredits";
		codingTest6.p1_getFirstNonRepChar(str);
		String str1="everything in the universe is within you by rumi everything in the universe is within you";
		String input=codingTest6.p2_getFirstNonRepWord(str1);
		System.out.println("First Non Repeating word is : "+ input);
	}

}

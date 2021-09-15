/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
package monika;

public class ScodingTest_6 {
	void getFirstNonRepeatingChar(String str) {
		for(int index=0; index<str.length(); index++) {
			if(index==str.lastIndexOf(str.charAt(index))) {
				System.out.println("First non Repeating Character from given '"+str+ "' is: "+str.charAt(index));
				break;
			}
		}
	}
	
	void getFirstNonREpeatingWord(String str1) {
		int count=0;
		String[] arr = str1.split(" ");
		String str2 = "", temp;
		for(int index=0; index<arr.length; index++) {
			count = 0;
			temp = arr[index];
			for(int index1=0; index1<arr.length; index1++) {
				if(temp.equals(arr[index1]))
					count++;
			}
			if(count==1) {
					str2 = arr[index];
					break;
			}
		}
		System.out.println("First non repeating word in '" + str1 + "' is: " + str2 );
	}
	
	public static void main(String[] args) {
		String input = "hi this is techno gm credits  this hi is";
		ScodingTest_6 scodingTest_6=new ScodingTest_6();
		scodingTest_6.getFirstNonRepeatingChar("technocredits");
		scodingTest_6.getFirstNonREpeatingWord(input);
	}
}

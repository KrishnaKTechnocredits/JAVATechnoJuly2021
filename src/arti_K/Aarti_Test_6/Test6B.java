/*	Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 */
package arti_K.Aarti_Test_6;

public class Test6B {

	void findFirstNonRepeatedWord(String input){
		String[] str = input.split(" ");
		String s = "", temp = "";
		
		
		for(int index = 0; index < str.length; index++){
			s = str[index];
			int count = 0;
			for(int innerindex = 0; innerindex < str.length; innerindex++){
				
				if(s.equals(str[innerindex])){
					temp = str[innerindex];
					count++;
				}
			}
			if(count == 1)
				break;
		}
		System.out.println("First non repeating word from a given String is : "+temp);
	}
	
	public static void main(String[] args){
		String input = "hi this is techno gm credits this hi is ";
		System.out.println("Given String : \"hi this is techno gm credits this hi is \"\n");
		new Test6B().findFirstNonRepeatedWord(input);
	}
}

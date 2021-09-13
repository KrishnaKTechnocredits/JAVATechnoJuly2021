package akanksha_Jain;

public class Coding_Test_6 {
	
	void findFirstNonRepeatCharacter(String str) {
		char output='\0';
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.charAt(index) == ch && index == str.lastIndexOf(ch)) {
				output = ch;
				break;
			}
		}
		System.out.println("First non repeating character in " + str + " is " + output);
	}
	
	void findFirstNonRepeatWordInString(String str2) {
		String[] arr = str2.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(str2.indexOf(arr[index])==str2.lastIndexOf(arr[index])) {
				System.out.println("First non repeating word in " + str2 + " is " + arr[index]);
				break;
			}
		}	
	}

	public static void main(String[] args) {
		String str = "technocredits";
		String str2 = "hi this is techno gm credits this hi is";
		Coding_Test_6 codingTest6 = new Coding_Test_6();
		codingTest6.findFirstNonRepeatCharacter(str);
		codingTest6.findFirstNonRepeatWordInString(str2);
	}
}

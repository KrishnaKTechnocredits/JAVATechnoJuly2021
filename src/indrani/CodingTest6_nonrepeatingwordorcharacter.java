package indrani;

public class CodingTest6_nonrepeatingwordorcharacter {
	
	void firstNonRepeatingCharacter(String str) {
		for(int index=0; index<str.length(); index++) {
			if(index==str.lastIndexOf(str.charAt(index))) {
				System.out.println("First non Repeating Character from given '"+str+ "' is: "+str.charAt(index));
				break;
			}
		}
	}

	void firstNonRepeatingWord(String str1) {
		int count=0;
		String[] arr = str1.split(" ");
		String str2 = "";
		for(int index=0; index<arr.length; index++) {
			count = 0;
			String temp = arr[index];
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
	    CodingTest6_nonrepeatingwordorcharacter nonrepeat = new CodingTest6_nonrepeatingwordorcharacter();
		nonrepeat.firstNonRepeatingCharacter("technocredits");
		nonrepeat.firstNonRepeatingWord("hi this is techno gm credits  this hi is");
	}
}

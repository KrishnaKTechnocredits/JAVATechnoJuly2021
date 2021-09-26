package margi.Assignment_34;

public class Assignment_34_3 {

	//find first non repeating vowel character from given string
	char getChar(String input) {
		char firstChar = input.charAt(0), ch, tempChar;
		int count;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			count=0;
			for(int innerIndex=0; innerIndex<input.length(); innerIndex++) {
				tempChar = input.charAt(innerIndex);
				if(ch == tempChar && (tempChar=='a'||tempChar=='e'||tempChar=='i'||tempChar=='o'||tempChar=='u')) 
					count++;
			}
			if(count==1) {
				firstChar = ch;
				break;
			}
		}
		return firstChar;
	}
	
	public static void main(String[] args) {
		Assignment_34_3 assignment_34_3 = new Assignment_34_3();
		String str = "aeapquawrpti";
		System.out.println("First non repeating character: " + assignment_34_3.getChar(str));
	}
}

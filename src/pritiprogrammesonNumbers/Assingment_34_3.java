package pritiprogrammesonNumbers;

public class Assingment_34_3 {
	
	
	char getFirstNonRepeatingChar(String input) {
		char firstChar = input.charAt(0);
		char ch, tempChar;
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
		Assingment_34_3 assingment_34_3 = new Assingment_34_3();
		String str = "aeapquawrpti";
		System.out.println("First non repeating character: " + assingment_34_3.getFirstNonRepeatingChar(str));
	}
	
}		
		



/*program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u*/


/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h */
package mayur.ProgrammingTest6;

public class NonRepeatingChar {
	
	char nonRepeatingCharInString(String input) {
		char firstchar = input.charAt(0);
		char temp ;
		int count;
		for(int index =0;index<input.length();index++){
			temp =input.charAt(index);
			count =0;
				for(int innerindex=0;innerindex<input.length();innerindex++) {
					if(temp==input.charAt(innerindex))
						count++;
				}
				if(count==1) {
					firstchar=temp;
					break;
				}
				
		}
		return firstchar;
	}

	public static void main(String[] args) {
		NonRepeatingChar nonRepeatingWord = new NonRepeatingChar();
		String str = "technocredits";
		System.out.println("First non repeating character in String is : "+nonRepeatingWord.nonRepeatingCharInString(str));
	}

}

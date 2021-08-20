package sourabh;

public class Assignment_15_2 {                  //Find Middle Char

	char findMiddleChar(String str) {

		char[] character = new char[str.length()]; 
		int no = 0;
		int charIndex = 0;

		for(int index = 0; index < str.length(); index++ ) {
			if(str.length() % 2 == 0) {
				no = str.length()/2-1;
				character[charIndex] = str.charAt(no); 
			}else {
				no = str.length()/2;
				character[charIndex] = str.charAt(no); 
			}
		}
		return character[charIndex];
	}

	void takeStringArray(String[] str) {

		for(int index = 0; index < str.length; index++) {
		  char ch = findMiddleChar(str[index]);
		  System.out.println("Middle Character of "+str[index]+" is "+ch);
		}
	}
	public static void main(String[] args) {
		String[] str = {"hello","techno","credits"};
		Assignment_15_2 findchar = new Assignment_15_2();
		findchar.takeStringArray(str);
	}
}

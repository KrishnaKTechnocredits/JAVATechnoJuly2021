package suchita;

// Test6_1

class Test6_1 {
	
	// Find first non repeating character in a string.
	void getNonRepeated(String input) {
	
		char str = 0;
		for(int index=0;index<input.length();index++) {
			if(index == input.lastIndexOf(input.charAt(index))) {
				str = input.charAt(index);
				break;
			}
		}
		System.out.println("\n First non repeating character in "+ input+ " is : "+ str);
	}
	
	
	// Find first non repeating word from a string.
	void getNonRepeatedWord(String input) {
		
		int count =1;
		String[] str = input.split(" ");
		for(int index=0;index<str.length;index++) {
			boolean flag = true;
			for(int i=0 ;i<str.length;i++) {
				if(index != i) {
					if(str[index].equals(str[i])){
					flag = false;
					break;
				}
				}
								
			}
			
			if(flag ){
				
				System.out.println("\nThe first non repeated word in the given string :: " + str[index]);
				break;
			
		}
		}
	}
	
	
	public static void main(String[] args) {
		
		Test6_1 test = new Test6_1();
		test.getNonRepeated("technocredits");
		String input = "hi this is techno gm credits this hi is";
		test.getNonRepeatedWord(input);
	}
}
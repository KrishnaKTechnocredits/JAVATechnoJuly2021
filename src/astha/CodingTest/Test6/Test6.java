package astha.CodingTest.Test6;

public class Test6 {

	void getNonRepeatingCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println("First non repeating character is : "+ input.charAt(index));
				return;
			}
		}
		System.out.println("There is no non repeating character in the input.");
	}
	
	void getNonRepeatingWord(String input) {
		String[] inputArr = input.split(" ");
		for(int index=0; index<inputArr.length; index++) {
			if(input.indexOf(inputArr[index]) == input.lastIndexOf(inputArr[index])) {
				System.out.println("First non repeating word is : " + inputArr[index]);
				return;
			}
		}
		System.out.println("There is no non repeating word in the input.");
	}

	public static void main(String[] args) {
		Test6 test6 = new Test6();
		test6.getNonRepeatingCharacter("technocredits");
		test6.getNonRepeatingWord("hi this is techno gm credits this hi is");
	}
}

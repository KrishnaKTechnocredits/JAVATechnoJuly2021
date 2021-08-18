package aniket;

public class MiddleChar {
	int middleCharacter;
	void getMiddleChar(String[] input) {
		for(int index = 0; index <= input.length-1; index++) {
			char[] output = new char[3];
			if(input[index].length()%2 == 0){
				middleCharacter = input[index].length()/2-1;
				output[index] = input[index].charAt(middleCharacter);
				System.out.println(output);
			}
			else {
				middleCharacter = input[index].length()/2;
				output[index] = input[index].charAt(middleCharacter);
				System.out.println(output);
			}
		}

	}

	public static void main(String[] args) {
		MiddleChar middlechar = new MiddleChar();
		String[] name = {"hello","techno","credits"};
		middlechar.getMiddleChar(name);
	}
}
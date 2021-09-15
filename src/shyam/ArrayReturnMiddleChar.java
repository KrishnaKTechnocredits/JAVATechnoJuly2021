package shyam;

public class ArrayReturnMiddleChar {
	
	public static void main(String[] args) {
		String[] str = {"Retrieve","Middle","Char","ELEMENT","Length","Example","Array"};
		ArrayReturnMiddleChar arrayReturnMiddleChar = new ArrayReturnMiddleChar();
		
		arrayReturnMiddleChar.retrieveMiddleChar(str);
	}

	void retrieveMiddleChar(String[] arrayInput){
		
		char middleChar;
		int middleLength;
		for(int index = 0; index < arrayInput.length; index++) {
			middleLength = arrayInput[index].length()/2;
			middleChar = arrayInput[index].charAt(middleLength);
			System.out.println("Middle character is "+ middleChar);
		}
	}

}
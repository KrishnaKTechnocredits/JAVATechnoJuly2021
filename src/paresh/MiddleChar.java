package paresh;

public class MiddleChar {

	char[] findMiddleCharacter(String[] input) {

		char[] arr = new char[3];
		for(int index = 0; index < input.length; index++) {
			arr[index] = input[index].charAt(input[index].length()/2);
		}
		return arr;
	}

	char[] createArray() {

		String[] arr= {"hello","techno","credits"};
		return findMiddleCharacter(arr);
	}

	void displayMiddleCharacter() {

		char[] arr = createArray();
		System.out.println("Middle character :-");
		for(int index = 0; index < arr.length; index++)
			System.out.println(arr[index]);
	}

	public static void main(String[] args) {

		MiddleChar middleChar = new MiddleChar();
		middleChar.displayMiddleCharacter();
	}
}
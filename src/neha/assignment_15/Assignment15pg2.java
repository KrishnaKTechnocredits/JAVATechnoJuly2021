package neha.assignment_15;

/*program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};*/
public class Assignment15pg2 {

	char[] middleCharacterFromStringArrayElements(String[] strArr) {
		char[] charIndex = new char[strArr.length];
		for (int index = 0; index < charIndex.length; index++) {
			if (strArr[index].length() % 2 == 0)
				charIndex[index] = strArr[index].charAt(strArr[index].length() / 2 - 1);
			if (strArr[index].length() % 2 != 0)
				charIndex[index] = strArr[index].charAt(strArr[index].length() / 2);
		}
		return charIndex;

	}

	public static void main(String[] args) {
		Assignment15pg2 assignment15pg2 = new Assignment15pg2();
		String[] str = { "hello", "techno", "credits" };

		System.out.println("Middle characters for String array elements are: ");
		for (int index = 0; index < str.length; index++) {
			System.out.print(assignment15pg2.middleCharacterFromStringArrayElements(str)[index] + " ");
		}
	}
}

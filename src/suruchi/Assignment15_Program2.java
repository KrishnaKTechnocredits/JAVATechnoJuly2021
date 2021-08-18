package suruchi;

public class Assignment15_Program2 {

	char[] getMiddleCharOfElements(String[] arr) {
		int middleChar = 0;
		char[] output = new char[arr.length];
		int index;
		for (index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				middleChar = arr[index].length() / 2 - 1;
			else
				middleChar = arr[index].length() / 2;

			output[index] = arr[index].charAt(middleChar);
		}
		return output;

	}

	public static void main(String[] args) {
		Assignment15_Program2 assignment15_Program2 = new Assignment15_Program2();

		String[] str = { "hello", "techno", "credits" };
		System.out.println("Array of elements is as displayed: ");
		for (int index = 0; index < str.length; index++)
			System.out.print(str[index] + " ");
		System.out.println();
		System.out.println();
		char[] output = assignment15_Program2.getMiddleCharOfElements(str);
		System.out.println("Middle characters of words given in the array are: ");
		for (int index = 0; index < output.length; index++)
			System.out.println(output[index]);
	}
}
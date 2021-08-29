package trupti;

public class Assignment_15_3 {

	char[] getMiddleChar(String[] str) {
		char[] ch = new char[5];
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() % 2 == 0) {
				ch[index] = str[index].charAt(str[index].length() / 2 - 1);
			} else {
				ch[index] = str[index].charAt(str[index].length() / 2);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		Assignment_15_3 assignment_15_3 = new Assignment_15_3();
		String[] arr = { "hello", "techno", "credits","trupti","maddy" };
		System.out.println(assignment_15_3.getMiddleChar(arr));
	}
}

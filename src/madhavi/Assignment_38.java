package madhavi;

public class Assignment_38 {

	public static void main(String[] args) {
		// Assignment_38 assignment_38 = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String[] strArr = str.split(" ");

		int count = 0;
		int startIndex = 0;
		int endIndex = strArr.length - 1;

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals("Hi")) {
				if (startIndex < i) {
					startIndex = i;
				}
			}

			if (strArr[i].equals("Globant")) {
				if (endIndex > i) {
					endIndex = i;
				}
			}
		}
		String[] opArr = new String[(endIndex - startIndex) + 1];
		StringBuffer sb = new StringBuffer();

		for (int i = startIndex; i <= endIndex; i++) {
			opArr[count] = strArr[i];
			sb.append(opArr[count]);
			count++;
		}

		String outputStr = sb.toString();
		System.out.println(outputStr);
		// System.out.println(Arrays.toString(opArr));

	}
}
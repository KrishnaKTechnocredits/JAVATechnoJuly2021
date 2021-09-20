package madhavi;

public class Interview_Code2 {
	int MaxSum = 0;
	String strxt;

	void getMaxSumDigitsString(String[] str) {
		for (int index = 0; index < str.length; index++) {
			int sum = 0;
			String temp = str[index];
			for (int index1 = 0; index1 < temp.length(); index1++) {
				char ch = temp.charAt(index1);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
				if (MaxSum < sum) {
					MaxSum = sum;
					strxt = str[index];

				}
			}
		}
		System.out.println(MaxSum + " " + strxt);

	}

	public static void main(String[] args) {
		Interview_Code2 interview_Code2 = new Interview_Code2();
		System.out.println("WAP to identify a string which have highest sum:");
		String[] input = { "a4j5k9", "k2l1u9" };
		interview_Code2.getMaxSumDigitsString(input);

	}

}

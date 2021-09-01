package husain.Assignment24;

import java.util.Arrays;

public class Program2 {

	void findFrequency(String str) {
		String arr[] = str.split(" ");
		int maxCount = 0;
		String maxStr = "";
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					maxStr = arr[j];

				}

			}

		}
		displayData(maxStr, maxCount);
	}

	void displayData(String str, int count) {

		System.out.println("Max String " + str + " and count " + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		String str = "Hi Hello Hi Techno Hello Hi";
		obj.findFrequency(str);
		// System.out.println("The ");

	}

}

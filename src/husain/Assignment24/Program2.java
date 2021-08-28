package husain.Assignment24;

import java.util.Arrays;

public class Program2 {

	void findFrequency(String str) {
		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					arr[j] = "0";
				}

			}
			displayData(arr[i], count);
		}
	}

	void displayData(String str, int count) {
		if (count > 1 && !str.equals("0"))
			System.out.println("String " + str + " and count " + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		String str = "Hi Hello Hi Techno Hello Hi";
		obj.findFrequency(str);
		// System.out.println("The ");

	}

}

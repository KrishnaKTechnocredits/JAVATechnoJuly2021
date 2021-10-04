package madhavi;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapVowel {
	void getSwapVowel(String str) {
		String[] str1 = str.split("");
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(str1));

		int firstindex = list1.size();
		int lastindex = 0;
		String ftemp = "";
		String ltemp = "";
		for (int index = 0; index < list1.size(); index++) {
			if (isVowel(list1.get(index).toString())) {
				if (firstindex > index) {
					firstindex = index;
					ftemp = list1.get(firstindex).toString();
				}

				if (lastindex < index) {
					lastindex = index;
					ltemp = list1.get(lastindex).toString();
				}
			}
		}
		// System.out.println(lastindex);
		// System.out.println(firstindex);
		list1.set(firstindex, ltemp);
		list1.set(lastindex, ftemp);
		System.out.println(list1.toString());
	}

	static boolean isVowel(String c) {
		// c = Character.toLowerCase(c);
		if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {

			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		SwapVowel swapVowel = new SwapVowel();
		String input = "good morning";
		swapVowel.getSwapVowel(input);
	}
}

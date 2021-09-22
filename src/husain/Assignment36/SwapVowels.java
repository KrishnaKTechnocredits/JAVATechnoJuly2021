package husain.Assignment36;

import java.util.Arrays;

public class SwapVowels {

	void vowelSwap(String str) {
		char vowel = ' ';
		int count = 0;
		int temp = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		int arr[] = new int[count];
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				arr[temp] = index;
				temp++;
			}
		}
		char[] ch = str.toCharArray();
		for (int index = 0; index < arr.length / 2; index++) {
			vowel = ch[arr[index]];
			ch[arr[index]] = ch[arr[arr.length - 1 - index]];
			ch[arr[arr.length - 1 - index]] = vowel;
		}
		System.out.println("Output " + Arrays.toString(ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapVowels vowel = new SwapVowels();
		String str = "curiosity mars rover";
		System.out.println("Input " + str);
		vowel.vowelSwap(str);

	}

}

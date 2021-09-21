package technocredits1.code_Interview;

public class Q11 {

	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "act";
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < str1.length(); i++) {
			sum1 += str1.charAt(i);
			sum2 += str2.charAt(i);
		}
		
		if(sum1!=sum2) {
			System.out.println("not anagram");
		}

		int count[] = new int[256];
//		for (int i = 0; i < str1.length(); i++) {
//			count[str1.charAt(i)]++;
//			count[str2.charAt(i)]--;
//		}
//		for (int i = 0; i < 256; i++) {
//			if (count[i] != 0) {
//				System.out.println("not anagram");
//				break;
//			}
//		}

		// for (int index = 0; index < str2.length(); index++) {
		// str1 = str1.replaceAll(String.valueOf(str2.charAt(index)), "");
		// }

		// if (s1.length() == s2.length()) {
		// char ch1[] = s1.toCharArray();
		// char ch2[] = s2.toCharArray();
		// Arrays.sort(ch1);
		// Arrays.sort(ch2);
		// for (int i = 0; i < ch1.length; i++) {
		// if (ch1[i] != ch2[i]) {
		// System.out.println("Not Anagram");
		// break;
		// }
		// }
		// } else {
		// System.out.println("Not Anagram");
		// }

	}
}

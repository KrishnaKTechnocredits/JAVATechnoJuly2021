package vivek.Assignment22;

public class Assignment22_1 {

	int getDigitsInString(String str) {
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Assignment22_1 assignment22_1 = new Assignment22_1();
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Total digits in the given string is " + assignment22_1.getDigitsInString(str));
	}
}

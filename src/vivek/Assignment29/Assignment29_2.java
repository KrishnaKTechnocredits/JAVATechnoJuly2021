package vivek.Assignment29;

public class Assignment29_2 {

	void checkPalendrome(String str) {
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == str.charAt(str.length() - index - 1))
				cnt++;
		}
		if (str.length() == cnt)
			System.out.println(str + " is a palendrome");
		else
			System.out.println(str + " is not a palendrome");
	}

	public static void main(String[] args) {
		Assignment29_2 assignment29_2 = new Assignment29_2();
		String str = "malayalam";
		assignment29_2.checkPalendrome(str);
	}
}

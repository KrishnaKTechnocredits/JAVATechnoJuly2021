package madhavi;

//program to print lowerstringUpperstring from a given string
public class Interview_Code1 {
	String upperString = "";
	String lowerString = "";
	String output = "";

	void getString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				lowerString = lowerString + ch;
			} else if (Character.isUpperCase(ch)) {
				upperString = upperString + ch;
			}
		}
		output = lowerString + upperString;
		System.out.println("Output :" + output);
	}

	public static void main(String[] args) {
		Interview_Code1 interview_Code1 = new Interview_Code1();
		System.out.println("WAP to differentiate upper case and lower case");
		String str = "heLLo ThERe";
		interview_Code1.getString(str);

	}
}
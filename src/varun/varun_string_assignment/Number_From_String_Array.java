package varun.varun_string_assignment;

public class Number_From_String_Array {
	
	int getNumberFromStringArray(String str) {
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				sum += Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}
	int getNumberFromArrayIndex(String []str) {
		int sum = 0;
		for (int index=0;index<str.length;index++) {
			sum += getNumberFromStringArray(str[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Number_From_String_Array number_From_String_Array = new Number_From_String_Array();
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println(number_From_String_Array.getNumberFromArrayIndex(input));
	}
}

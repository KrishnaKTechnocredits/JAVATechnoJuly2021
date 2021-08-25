package aniket;

public class Assignment_22 {
	int count = 0;

	int getCountOfDigit(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}

		return count;

	}

	/*
	 * using ascii values void getCount(String input){ for(int
	 * index=0;index<input.length();index++) { char ch = input.charAt(index);
	 * if(ch>47 && ch<58) { count++;
	 * 
	 * }
	 * 
	 * } System.out.println(count);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("The count of digit in given string is " + new Assignment_22().getCountOfDigit(str));
		// Assignment_22 assignment_22 = new Assignment_22();
		// assignment_22.getCount(str);
	}

}

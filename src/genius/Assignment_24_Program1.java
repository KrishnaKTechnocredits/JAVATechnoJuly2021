package genius;

public class Assignment_24_Program1 {
	int count = 0;
	int getVowels(String input) {
		int count = 0;
		System.out.println("vowels are : ");
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
						|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
					System.out.println(input.charAt(index));
					count++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		String str = "technocredits";
		Assignment_24_Program1 assignment_24 = new Assignment_24_Program1();
		int ans = assignment_24.getVowels(str);
		System.out.println("Count of vowels in given string are "+ ans);

	}

}

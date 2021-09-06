package akshay;

public class Assignment_25_2 {
	
	String getSort(String input) {
		String digit = "";
		String upper = "";
		String lower = "";
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				digit = digit + ch;
			if(Character.isUpperCase(ch))
				upper = upper + ch;
			if(Character.isLowerCase(ch))
				lower = lower + ch;
		}
		return upper+ digit+ lower;
	}
	
	public static void main(String[] args) {
		Assignment_25_2 sort = new Assignment_25_2();
		System.out.println("Output: " +sort.getSort("Ma1U2liK"));
	}
}

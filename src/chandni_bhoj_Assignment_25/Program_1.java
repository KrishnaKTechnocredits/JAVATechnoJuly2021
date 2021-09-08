package chandni_bhoj_Assignment_25;

public class Program_1 {
	
	int getSumOfAllNumbers (String input) {
		int sum = 0;
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				str += input.charAt(index);
			else {
				if (!str.equals(""))
					sum += Integer.parseInt(str);
					str = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Program_1().getSumOfAllNumbers("te12ch33no3credit4s"));
	}
}

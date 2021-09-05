package akshay;

public class Assignment_25_1 {
	int getDigit(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp +ch;
			} 
			else 
			{
				if (!temp.equals(""))
					sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment_25_1 assignment25_1 = new Assignment_25_1();
		String str = "te12ch33no3credit4s";
		System.out.println("The sum of digit in the given string is : " + assignment25_1.getDigit(str));
	}
}

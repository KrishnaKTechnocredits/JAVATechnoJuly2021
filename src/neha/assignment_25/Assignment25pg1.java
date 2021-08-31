package neha.assignment_25;

/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4*/
public class Assignment25pg1 {
	int sumOfConsecutiveDigits(String str) {
		int sum = 0;
		String numStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				numStr += ch;
			} else {
				if (numStr != "") {
					sum += Integer.parseInt(numStr);
					numStr = "";
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment25pg1 assignment25pg1 = new Assignment25pg1();
		String strInput = "te12ch33no3credit4s";
		System.out.println("Sum of consecutive digits is: " + assignment25pg1.sumOfConsecutiveDigits(strInput));
	}
}

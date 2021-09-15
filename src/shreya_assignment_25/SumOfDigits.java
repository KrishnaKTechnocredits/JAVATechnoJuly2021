package shreya_assignment_25;

public class SumOfDigits {
	int sum=0;
	String  input="";
	void getSum(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				input += str.charAt(index);
			else if (input != "") {
				sum += Integer.parseInt(input);
				input = "";
			}
		}
		System.out.println("Output:" + sum);
 
	}
	public static void main(String[] args) {
		SumOfDigits sumOfDigits=new SumOfDigits();
		sumOfDigits.getSum("te12ch33no3credit4s");

	}

}

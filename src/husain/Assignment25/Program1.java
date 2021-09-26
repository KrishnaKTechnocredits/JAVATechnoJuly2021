package husain.Assignment25;

public class Program1 {

	void loopString(String str) {

		String temp = "";
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index)))
				temp = temp + str.charAt(index);
			else if (temp.length() > 0) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (temp.length() > 0)
			sum = sum + Integer.parseInt(temp);

		System.out.println("The sum of numbers in the given string " + str + " is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		String str = "te12ch33no3credit4s14";
		obj.loopString(str);

	}

}

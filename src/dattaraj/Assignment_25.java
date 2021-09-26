package dattaraj;

public class Assignment_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "te12ch33no3credit4s";
		Assignment_25 assign25_P1 = new Assignment_25();
		assign25_P1.getNumSum(input);
	}
	
	void getNumSum(String input) {
		int sum = 0;
		String temp_num = "";
		for (int i = 0; i<input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				temp_num = temp_num + input.charAt(i);
			} else {
				if (!temp_num.equals("")) {
					sum = sum + Integer.parseInt(temp_num);
					temp_num = "";
				}
			}
		}
		System.out.println("The sum of numbers in a string "+ input +" is : " + sum);
	}
}

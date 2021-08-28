package dattaraj;

public class Assignment_22_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22_P2 assign_p2= new Assignment_22_P2();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of digits in given string are :"+assign_p2.getDigitSum(str));
	
	}

	int getDigitSum(String str) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum+=Character.getNumericValue(str.charAt(i)) ;
			}
		}
		return sum;
	}

}

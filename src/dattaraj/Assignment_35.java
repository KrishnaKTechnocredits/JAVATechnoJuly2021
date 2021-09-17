package dattaraj;

public class Assignment_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_35 assign35 = new Assignment_35();
		String p1 = "MH 12 BK 4432"; //valid
		String p2 = "MH-12 BK 1432"; //valid
		String p3 = "GJ 05 MK 1123"; //Valid
		String p4 = "MH 12-BK 4432"; //invalid
		assign35.displayResult(p1);
		assign35.displayResult(p2);
		assign35.displayResult(p3);
		assign35.displayResult(p4);
	}

	 private boolean isValidNumberPlate(String vehNum) {
		 boolean validNumber=false;
		 if(vehNum.length()!=13) {
			 validNumber=false;
		 }else {			 
			 String[] str_Split = vehNum.split(" ");
			 if(str_Split.length==4) {
				String letter = vehNum.substring(0, 2) + vehNum.substring(6, 8);
				if (isAllLetter(letter)) {
						String number = vehNum.substring(3, 5) + vehNum.substring(9);
						if (isAllDigit(number)) {
							validNumber = true;
						} else
							validNumber = false;
				} else  {
						validNumber = false;
				}
			 }else if(str_Split.length==3) {
				 if (vehNum.charAt(2) == '-') {
					String letter = vehNum.substring(0, 2) + vehNum.substring(6, 8);
					if (isAllLetter(letter)) {
						String number = vehNum.substring(3, 5) + vehNum.substring(9);
						if (isAllDigit(number)) {
							validNumber = true;
						} else {
							validNumber = false;
						}
					} else {
						validNumber = false;
					}
				} else {
					validNumber = false;
				}
			 }
			 
		 }
		// TODO Auto-generated method stub
		 return validNumber;
		
	}

	private boolean isAllDigit(String number) {
		// TODO Auto-generated method stub
		boolean isDigit = false;
		for (int index = 0; index < number.length(); index++) {
			if (Character.isDigit(number.charAt(index)) && number.length() == 6) {
				isDigit = true;
			} else {
				isDigit = false;
				break;
			}
		}
		return isDigit;
	}

	private boolean isAllLetter(String letter) {
		// TODO Auto-generated method stub
		boolean isLetter = false;
		for (int index = 0; index < letter.length(); index++) {
			if (Character.isLetter(letter.charAt(index)) && letter.length() == 4) {
				isLetter = true;
			} else {
				isLetter = false;
				break;
			}
		}
		return isLetter;
	}
	
	void displayResult(String input) {
		if(isValidNumberPlate(input)) {
			System.out.println(input+" is a valid number plate");
		}else {
			System.out.println(input+" is not a valid number plate");
		}
	}

}

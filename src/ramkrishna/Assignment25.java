package ramkrishna;

public class Assignment25 {
	
	void sumStringNumbers(String str) {

 		int sum = 0;
 		String input = "";

 		for (int index = 0; index < str.length(); index++) {

 			if (Character.isDigit(str.charAt(index))) {
 				input += str.charAt(index);
 			} else if (input != "" && !Character.isDigit(str.charAt(index))) {
 				sum += Integer.parseInt(input);
 				input = "";
 			}
 		}
 		System.out.println("Sum of Numbers present in string : "+sum);
 	}

 	public static void main(String[] args) {
 		new Assignment25().sumStringNumbers("te12ch33no3credit4s");

 	}

}

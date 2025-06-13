/*String str = "te12ch33no3credit4s"; 
output = 12+33+3+4
*/

package shyam;

public class SumOfmultipleDigitNumberinString {
	
public static void main(String[] args) {
	SumOfmultipleDigitNumberinString newObject = new SumOfmultipleDigitNumberinString();
	System.out.println("Sum of the digits in the given String is :- "+newObject.sumOfMultipleDigitsInString("te12ch33no3credit4s"));
}

int sumOfMultipleDigitsInString(String inputString) {
	
	int sum = 0;
	String temp = "";
	System.out.println("Input String is :- "+ inputString);
	
	for(int index=0; index<inputString.length(); index++) {
		
		if(Character.isDigit(inputString.charAt(index)))
			temp += inputString.charAt(index);
		
		else if(!temp.equals("")) {
			sum += Integer.parseInt(temp);
			System.out.print(temp+"+");			
			temp = "";
		}
	}
	System.out.println();
	return sum;
} 
}

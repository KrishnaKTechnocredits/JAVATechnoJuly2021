/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/
package shalaka.Assignment25;

public class SumOFNumbers {
	int getSumOfNumbers(String input) {
		int sum = 0;
		String sumDigit = "0";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sumDigit += ch;
			} else {
				sum += Integer.parseInt(sumDigit);
				sumDigit = "0";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "te12ch33no3credit4s";
		SumOFNumbers sumOFNumbers = new SumOFNumbers();
		int optputSum = sumOFNumbers.getSumOfNumbers(str);
		System.out.println(optputSum);
	}

}

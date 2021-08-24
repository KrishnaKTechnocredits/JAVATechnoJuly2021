/*program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/

package akshay;

public class SumofStatementNumbers {
	
	int getSumofNumbers(String input) {
		int sum = 0;
		String[] str = input.split(" ");
		for(int index = 0; index < str.length; index++) {
			sum = sum + Integer.parseInt(str[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumofStatementNumbers sum = new SumofStatementNumbers();
		String input = "10 10 20 30";
		System.out.println("Sum of the numbers in statement: " +sum.getSumofNumbers(input));
	}
	
}

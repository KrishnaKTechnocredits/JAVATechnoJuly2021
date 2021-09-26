/* Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4 = 52 */
package atul_K.Assignments.Ass25;

public class Program1 {
	int sumOfNumInString(String str) {
		int sum =0;
		String temp = "0";
		for (int index=0;index <str.length();index++) {
			if (Character.isDigit(str.charAt(index))) {
			temp = temp+str.charAt(index);
			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
	return sum;	
	}
	
	public static void main(String[] args) {
		String str = "te12ch33no3credit4s";
		Program1 p1 = new Program1();
		System.out.println(p1.sumOfNumInString(str));
	}
}

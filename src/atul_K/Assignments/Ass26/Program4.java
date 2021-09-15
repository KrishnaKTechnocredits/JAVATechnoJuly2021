/*Program : 4 
swap 2 numbers without using 3rd variable*/
package atul_K.Assignments.Ass26;

public class Program4 {

	void swapnumWithoutExtraVarible(int num1, int num2) {
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Num1 : "+num1+", Num2 : "+num2);
	}
	
	public static void main (String[] args) {
		Program4 p4 = new Program4();
		p4.swapnumWithoutExtraVarible(77, 99);
	}
}

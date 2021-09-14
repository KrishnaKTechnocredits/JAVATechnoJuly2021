/* Assignment - 2 : 2nd Aug'21
*Create a class called Bank having 3 methods and one instance variable.
- expected operations - debitAmount, creditAmount, displayBalanace.
- variable balance to hold current balance.
- create only one object and call methods multiple times
 */

package akanksha_Jain;

public class Assignment_2{
	int num1 = 10;
	int num2 = 5;

	void add(){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is " + sum);
	}

	void subtract(){
		int subtract = num1 - num2;
		System.out.println("Subtraction of 2 numbers is " + subtract);
	}

	void multiply(){
		int multiply = num1 * num2;
		System.out.println("Multiplication of 2 numbers is " + multiply);
	}

	void division(){
		int divide= num1/num2;
		System.out.println("Division of 2 numbers is " + divide);
	}

	public static void main(String[] args){
		Assignment_2 calculator = new Assignment_2();
		calculator.add();
		calculator.subtract();
		calculator.multiply();
		calculator.division();
	}
}

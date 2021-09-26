/* Assignment - 31 : 9th Sep'2021
Program 2 : verify given number is a perfect square.
input : 25
output : 25 is perfect square.
input : 20
output : 20 is not a perfect square.
*/

package akanksha_Jain.Assignment_31;

public class Program_2_PerfectSquare {

	int isPerfectSquare(int number) {
		int pSquareNumber=0;
		for (int index=1; index<number; index++) {
			if(number%index == 0) {
				pSquareNumber = index;
			}
		}
		return pSquareNumber;
	}
	
	void displayPerfectSquareResult(int number) {
		int perfSNo = isPerfectSquare(number);
		if(perfSNo * perfSNo == number)
			System.out.println(number + " is a perfect square");
		else
			System.out.println(number + " is not a perfect square");
	}

	public static void main(String[] args) {
		int number = 25; // 5 * 5 = 25 equal to number
		int number2 = 20; // 10 * 10 = 100 not equal to number2
		Program_2_PerfectSquare perfSquare = new Program_2_PerfectSquare();
		perfSquare.displayPerfectSquareResult(number);
		perfSquare.displayPerfectSquareResult(number2);
	}
}

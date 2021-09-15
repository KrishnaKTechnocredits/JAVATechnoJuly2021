/*Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.*/

package shraddha.Assignment31;

public class PerfectSquare {
	public static void main(String[] args) {
		PerfectSquare newObject = new PerfectSquare();
		int number = 50;
		if(newObject.checkIfNumberIsPerfectSquare(number))
			System.out.println("Number "+number+" is a Perefct Square");
		else
			System.out.println("Number "+number+" is NOT a Perefct Square");
	}

	boolean checkIfNumberIsPerfectSquare(int number) {
		int sqrt = (int) Math.sqrt(number);
		//System.out.println(sqrt);
		//System.out.println(sqrt*sqrt);
		if (sqrt * sqrt == number)
			return true;
		else
			return false;
	}
}

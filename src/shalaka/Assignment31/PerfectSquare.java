/*Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.
input : 20
output : 20 is not a perfect square.*/
package shalaka.Assignment31;

public class PerfectSquare {
	boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		int square = sqrt * sqrt;
		if (square == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 25;
		int number1=20;
		PerfectSquare perfectSquare = new PerfectSquare();
		PerfectSquare perfectSquare1 = new PerfectSquare();
		boolean isPerfectSquare = perfectSquare.isPerfectSquare(number);
		boolean isPerfectSquare1 = perfectSquare1.isPerfectSquare(number1);
		if (isPerfectSquare)
			System.out.println(number + " is perfect square");
		else
			System.out.println(number + " is not perfect square");

		if (isPerfectSquare1)
			System.out.println(number1 + " is perfect a square");
		else
			System.out.println(number1+ " is not perfect a square");
	}
}

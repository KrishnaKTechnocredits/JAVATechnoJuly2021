/*	Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.
 */

package arti_K.Assignment_31;


public class PerfectSquareNumber {
	
	void isPerfectSquare(int input){
		
		int num = (int)Math.sqrt(input);
		int numSquare = num * num;
		
		if(numSquare == input)
			System.out.println("Given number "+input+" is an Perfect Square.");
		else
			System.out.println("Given number "+input+" is not an Perfect Square.");
	}
	
	public static void main(String[] args){
		int num = 36;
		int num1 = 48;
		PerfectSquareNumber sq = new PerfectSquareNumber();
		sq.isPerfectSquare(num);
		sq.isPerfectSquare(num1);
	}
}

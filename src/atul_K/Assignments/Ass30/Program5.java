/*
  Program 5 : verify given number is a perfect square.
 */
package atul_K.Assignments.Ass30;

public class Program5 {

	boolean isPerfectsquare(int num) {
		double sqrt = Math.sqrt(num);
		double sqr = sqrt * sqrt;
		if (num == sqr)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		int num= 25;
		Program5 p5 = new Program5();
		if (p5.isPerfectsquare(num))
			System.out.println(num + " is perfect square");
		else 
			System.out.println(num + " is not perfect square");
	}
}

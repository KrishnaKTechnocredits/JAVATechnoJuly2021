package aniket;

//verify the given number is perfect square or not 
public class Assignment_31_2 {

	Boolean isPerfectSquare(int number) {

		int input = (int)Math.sqrt(number);
		int numsqure = input*input;
		
		if (number == numsqure) {
			System.out.println("Square root of number "+ number + " is :" + input);
			return true;
		} else {
			System.out.println(number + " is not perfect square");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("The given number is a perfect square " + new Assignment_31_2().isPerfectSquare(26));

	}

}
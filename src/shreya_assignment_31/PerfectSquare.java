package shreya_assignment_31;

import java.util.Scanner;

public class PerfectSquare {
	boolean isPerfectSquare(int input) {
		int num1,num2;
		num1 = (int)Math.sqrt(input);
		num2=num1*num1;
		if(input==num2) 
			return true;
		else
			return false;
	}
	void displayResult(int num) {
		if(isPerfectSquare(num)) {
			System.out.println("Number "+num+" is a perfect square");
		}
		else {
			System.out.println("Number "+num+" is not a perfect square");
		}
	}

		
		
	

	public static void main(String[] args) {
		PerfectSquare perfectSquare = new PerfectSquare();
        int num=25;
        perfectSquare.displayResult(num);
        num=20;
        perfectSquare.displayResult(num);// TODO Auto-generated method stub

	}

}

package husain.Assignment30;

import java.util.Scanner;

public class Program4 {
	
	boolean isPerfectNum(int input){
		
		int num = input;
		int sum = 0;
		for(int index = 1; index < input; index++ ) {
			if(input%index == 0)
				sum = sum + index;			
		}
		
		if(sum == num)
			return true;
		else
			return false;
		
	}
	
	void display(int input) {

		if (isPerfectNum(input))
			System.out.println(input + " is a perfect number");
		else
			System.out.println(input + " is not a perfect number");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 obj = new Program4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int input = scanner.nextInt();
		obj.display(input);


	}

}

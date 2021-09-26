package devendra_Assignment_30;

import java.util.Scanner;

public class Assignment30_FourIn_One {
	//p1
	int getReverseNumber(int num) {
		int reverseNum = 0;
		while(num > 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}
		return reverseNum;
	}
	//p2
	void isNumArmstrong(int input) {
		int sum = 0;
		int remainder = 0;
		int num1 = input;
		while(num1 > 0) {
			remainder = num1 % 10;
			sum += (remainder * remainder * remainder);
			num1 /= 10;
		}
		if(sum == input) 
			System.out.println(input+" is Armstrong Number.");
		else 
			System.out.println(input+" is not an Armstrong Number.");
	}
	//p3
	static void isGivenNumAPerfectNumber() {	
		System.out.print("Enter Number to Check if it is Perfect Number or Not : ");
		Scanner s1 = new Scanner(System.in);
		int num3 = s1.nextInt();		
		int index = 1;
		int sum = 0;
		while(index < num3) {
			if(num3 % index == 0)
				sum += index;
				index++;
		}
		if(sum == num3)
			System.out.println(num3+" is Perfect Number");
		else
			System.out.println(num3+" is Not a Perfect Number");
	}
	//p4
	void isPerfectSquare(){
		System.out.print("Enter Number to check if it is Perfect Square or Not : ");
		Scanner s1 = new Scanner(System.in);
		int num4 = s1.nextInt();
		int index = 1;
		int square = 0;
		while(num4 > index)	{
			if(num4 % index == 0)
				square = index;
				index++;
		}
		if(square * square == num4)
			System.out.println(num4+" is Perfect square");
		else
			System.out.println(num4+" is Not a Perfect square");
	}
			
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Assignment30_FourIn_One obj = new Assignment30_FourIn_One();
		//p1
		System.out.print("Enter Number to Reverse : ");
		int num = s1.nextInt();
		System.out.println("Reverse Number is :" +obj.getReverseNumber(num));
		//p2
		System.out.print("Enter Number to Check if it is Armstrong or Not : ");
		int num1 = s1.nextInt();
		obj.isNumArmstrong(num1);
		//p3
		obj.isGivenNumAPerfectNumber();
		//p4
		obj.isPerfectSquare();
	}
}
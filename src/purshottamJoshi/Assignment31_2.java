package purshottamJoshi;

import java.lang.Math;
import java.util.Scanner;
class Assignment31_2{
	int a;
	void checkPerfectSquare(int number) {
		a= (int)Math.sqrt(number);
		if(a * a == number){
			System.out.println(number+" is perfect Square");
		}else{
			System.out.println(number+" is not perfect Square");
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		Assignment31_2 assignment31_2 = new Assignment31_2();
		assignment31_2.checkPerfectSquare(number);
	}
}

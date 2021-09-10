package swati.Assignment30;

import java.util.Scanner;

public class Assignment30 {
	
	int reverseNum(int num) {
		int reveNum=0;
		int remainder=0;
		while(num>0) {
			remainder=num%10;
			reveNum=reveNum*10+remainder;
			num=num/10;
			
		}
		return reveNum;
	}	
	
	void displayPallindromeResult(int num){
		int reverseNum=reverseNum(num);
		if(reverseNum==num) {
			System.out.println(num +" is Pallindrome");
		}
		else
			System.out.println(num +" is not a Pallindrome");	
	}
	
	void findArmstrong(int inputNum) {
		int armstrongNum=0;
		int rem=0;
		int num=inputNum;
		while(num>0) {
			rem=num%10;
			armstrongNum=armstrongNum+(rem*rem*rem);
			num=num/10;
		}
		
		if(armstrongNum==inputNum) {
			System.out.println(inputNum +" is Armstrong number.");
		}
		else
			System.out.println(inputNum +" is not Armstrong number.");
			
	}
	
	void findPerfect(int num) {
		int sum=0;
		for(int index=1;index<=num/2;index++) {
			if(num%index==0) {
				sum=sum+index;
			}
		}
		
		if(sum==num) {
			System.out.println(num +" is Perfect number.");
		}
		else
			System.out.println(num +" is not a Prefect number.");
	}
	
	public static void main(String[] a) {
		Assignment30 a1=new Assignment30();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=scan.nextInt();
		a1.displayPallindromeResult(number);
		System.out.println("Enter Number :");
		number=scan.nextInt();
		a1.findArmstrong(number);
		System.out.println("Enter Number :");
		number=scan.nextInt();
		a1.findPerfect(number);
	}

}

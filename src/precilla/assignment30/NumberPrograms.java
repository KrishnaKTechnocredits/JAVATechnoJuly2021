package precilla.assignment30;

import java.util.Scanner;

public class NumberPrograms {
	public static void main(String[] args) {
		NumberPrograms numberPrograms=new NumberPrograms();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("***************Reverse Program ***********");
		System.out.print("Enter number :");
		int number=scanner.nextInt();
		System.out.print(number+" after reversing :" +numberPrograms.getReverseNumber(number));
	
		System.out.println("\n***************Armstrong Program ***********");
		System.out.print("Enter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.getArmstrongNumber(number);
		System.out.print("\nEnter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.getArmstrongNumber(number);
	
		System.out.println("\n***************Palindrome Program ***********");
		System.out.print("Enter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPalindrome(number);
		System.out.print("\nEnter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPalindrome(number);
		
		System.out.println("\n***************Perfect Program ***********");
		System.out.print("Enter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPerfectNunber(number);
		System.out.print("\nEnter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPerfectNunber(number);
		
		System.out.println("\n***************Perfect Square Program ***********");
		System.out.print("Enter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPerfectSquareNunber(number);
		System.out.print("\nEnter number :");
		number=scanner.nextInt();
		System.out.print(number);
		numberPrograms.isPerfectSquareNunber(number);
	
	}

	private void isPerfectSquareNunber(int number) {
		double out=Math.sqrt(number);
		if(out==(int)(out))
			System.out.print(" is a perfect sqaure number ");
		else
			System.out.print(" is not a perfect sqaure number");
	}

	private boolean getArmstrongNumber(int number) {
		boolean flag=false;
		String armStrong=number+"";
		int sum=0;
		int cube=0;
		for(int index=0;index<armStrong.length();index++) {
			cube=Integer.parseInt(String.valueOf(armStrong.charAt(index)));
			cube=cube*cube*cube;
			sum=sum+cube;
		}
		if(sum==number) {
			flag=true;
			System.out.print(" is Armstrong");
		}else {
			flag=false;
			System.out.print(" is not Armstrong");
		}
	return flag;
	}

	private int getReverseNumber(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public void isPerfectNunber(int number) {
		int count=1;
		int sum=0;
		while(count<number) {
			if((number%count)==0) {
				sum=sum+count;	
			}
			count++;
		}
		if(sum==number)
			System.out.print(" is a perfect number ");
		else
			System.out.print(" is not a perfect number ");
	}
	public boolean isPalindrome(int number) {
		int reverse=getReverseNumber(number);
		boolean flag=false;
		if(number==reverse) {
			flag=true;
			System.out.print(" is Palindrome");
		}else {
			flag=false;
			System.out.print(" is not palindrome ");
		}
		return flag;
	}
	
}

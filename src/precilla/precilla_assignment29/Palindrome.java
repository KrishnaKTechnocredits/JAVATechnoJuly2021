package precilla.precilla_assignment29;

import java.util.Scanner;

public class Palindrome {
	boolean isPalindrome(String input) {
		String output="";
		boolean result = false;
		for(int index=input.length()-1;index>=0;index--) {
			output=output+input.charAt(index);
		}
		if(output.equalsIgnoreCase(input)) {
			result=true;
			getResult(input,result);
		}
		else {
			result=false;
			getResult(input,result);
		}
		return result;
	}
	boolean isPalindromewithoutReverse(String input) {
		boolean result=false;
		int start=0;
		int endIndex=input.length()-1;
		while(start<endIndex) {
			if(input.charAt(start)==input.charAt(endIndex))
				result=true;
			else
				result=false;
			start++;
			endIndex--;
		}
		return result;	
	}
		
	void isNumberPalindrome(int num) {
		int reverse=0,rem;
		int originalnumber=num;
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
	    String input=originalnumber+"";
		if(originalnumber==reverse)
			getResult(input,true);
		else
			getResult(input,false);
	}
	void getResult(String input,boolean result) {
		if(result==true)
			System.out.println(input+" is a palindrome ");
		else
			System.out.println(input+" is not a palindrome ");	
	}
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		char choice='Y';
		Scanner scanner=new Scanner(System.in);
		while(choice=='Y'||choice=='y') {
				System.out.println("Program 1 : String Palindrome by writing reverse method logic ");
				System.out.print("Enter the input : ");
				String input=scanner.next();
				palindrome.isPalindrome(input);
				
				System.out.println("\nProgram 2 : String Palindrome by without writing reverse method logic ");
				System.out.print("Enter the input : ");
				String input1=scanner.next();
				if(palindrome.isPalindromewithoutReverse(input1))
					System.out.println(input1+" is a palindrome ");
				else
					System.out.println(input1+" is not a palindrome ");
				
				System.out.println("\nProgram 3 : Given number is palindrome or not, without converting input into String?");
				System.out.print("Enter the number : ");
				int input2=scanner.nextInt();
				palindrome.isNumberPalindrome(input2);
				
				System.out.println("\nDo you want to find a palindrome ? Enter Y or y : ");
				choice=scanner.next().charAt(0);
				System.out.println();
		}
		scanner.close();
	}

}


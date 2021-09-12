package suchita;

//Assignment 29


class Assignment29 {

// check given string is pallindrome or not with reverse
	void getPallindrome(String arr) {
		
		
		String reverse = "";
		for(int index=arr.length()-1;index>=0;index--) {
			reverse += arr.charAt(index);
		}
		System.out.println("\n");
		if(arr.equals(reverse))
			
			System.out.println(arr + " is Pallindrome");
		else
			
			System.out.println(arr + " is not a Pallindrome");
	}
	
	// check given string is pallindrome or not without reversing
	boolean getPallindromeWithoutReverse(String arr) {
		
		boolean flag = false;
		for(int index=0;index<arr.length();index++) {
			
			if(arr.charAt(index) == arr.charAt(arr.length()-1))
				flag = true;
				//System.out.println( arr + " is Pallindrome\n");
			else
				flag = false;
				//System.out.println(arr + " is not a Pallindrome\n");
			break;
		}
		return flag;
	}
	
	// check given number is pallindrome or not
	void getNumberPallindrome(long num) {
		
		
		long num1 = num;
		long sum=0;
		long rem =0;
			
		while(num > 0) {
			
			rem = num % 10;
			sum = sum*10 +rem;
			num = num/10;
		}
		System.out.println("\n");
		if(sum == num1)
			
			System.out.println( sum + " is Pallindrome");
		else
			
			System.out.println(sum + " is not a Pallindrome");
	}
	
	//Display method for getPallindromeWithoutReverse
	void displayPallindromeResult(String input) {
		System.out.println("\n");
		if(getPallindromeWithoutReverse(input))
			System.out.println( input + " is Pallindrome");
		else
			System.out.println(input + " is not a Pallindrome");
	}
	
	public static void main(String[] args) {
		
		Assignment29 assignment = new Assignment29();
		String arr1 = "naman";
		String arr2 = "shayam";
		assignment.getPallindrome(arr1);
		assignment.getPallindrome(arr2);
		assignment.displayPallindromeResult("bangalore");
		assignment.displayPallindromeResult("malayalam");
		assignment.getNumberPallindrome(1234321);
		assignment.getNumberPallindrome(124321);
	}
}
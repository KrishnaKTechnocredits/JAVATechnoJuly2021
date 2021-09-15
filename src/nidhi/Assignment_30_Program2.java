package nidhi;
// reversing a number without converting it into string and checking pallindrome

class Assignment_30_Program2{
	
	void displayNumberPallindrome(int num){
		int revnum = reverseNumber(num);
		if (revnum == num)
			System.out.println(num + " is pallindrome.");
		else
			System.out.println(num + " is not pallindrome.");
	}
	
	int reverseNumber(int num){
		int revnum = 0;
		while (num > 0){
			int rim = num % 10; //121%10 = 12
			revnum = revnum * 10 + rim; // 12
			num = num/10; 
		}
		return revnum;
	}
	
	
	public static void main(String[] ar){
		Assignment_30_Program2 assignment30 = new Assignment_30_Program2();
		int input = 123454321;
		//System.out.println(assignment30.reverseNumber(input));
		assignment30.displayNumberPallindrome(input);
		
		
	}
}
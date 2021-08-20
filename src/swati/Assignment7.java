package swati;
class Assignment7{
	
	void printEvenNumbers(int startIndex,int endIndex){
		System.out.println("Even numbers are:");
		for(int index=startIndex;index<=endIndex;index++)
			if (index%2==0)
				System.out.println(index);			
	}
	
	void divisibleBy5(int startIndex,int endIndex){
		System.out.println('\n' + "Divisible by 5, numbers are:");
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0)
				System.out.println(index);			
	}
		
	void divisibleBy5and3(int startIndex,int endIndex){
		System.out.println('\n' + "Number is divisible by 5 and 3 are:");
		
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0&&index%3==0)
				System.out.println(index);		
	}
	
	void divisibleBy7or13(int startIndex,int endIndex){
		System.out.println('\n' + "Divisible by 7 or 13, numbers are:");
		for(int index=startIndex;index<=endIndex;index++)
			if(index%7==0)
				System.out.println(index + " is divisible by 7" );	
			else if(index%13==0)
				System.out.println(index + " is divisible by 13" );		
	}
	
	void sumOfAllNumbers(){
		int sum=0;
		for(int index=1;index<=5;index++)
			sum=sum+index;
		System.out.println('\n' + "sum is:" + sum);
	}
	
	void diffBetweenSumOfOddEvenNumbers(){
		int evenSum=0;
		int oddSum=0;
		int difference=0;
		for(int index=3;index<=9;index++){
			if (index%2==0)
				evenSum=evenSum+index;
			else if(index%2!=0)
				oddSum=oddSum+index;
		}
		difference=oddSum-evenSum;
		System.out.println('\n' + "Difference between sum of odd numbers and even numbers is:" + difference);
	}
	
	void oddNumbersInReverse(){
		System.out.println('\n' + "Odd numbers in reverse order:");
		for(int index=20;index>=10;index--){
			if(index%2!=0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] a){
		
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumbers(10,15);
		assignment7.divisibleBy5(10,30);
		assignment7.divisibleBy5and3(5,18);
		assignment7.divisibleBy7or13(5,40);
		assignment7.sumOfAllNumbers();
		assignment7.diffBetweenSumOfOddEvenNumbers();
		assignment7.oddNumbersInReverse();
		
	}
	
}
	
	

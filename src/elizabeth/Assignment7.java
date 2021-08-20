package elizabeth;

class Assignment7{
	
	void evenNumbers(int startIndex, int endIndex){
		int num;
		System.out.println("Even numbers are:");
		for(num=startIndex;num<=endIndex;num++)
		{
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	void divisibleBy5(int startIndex, int endIndex){
		int num;
		System.out.println("Numbers divisible by 5 are:");
		for(num=startIndex;num<=endIndex;num++)
		{
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	
	void divisibleBy3and5(int startIndex, int endIndex){
		int num;
		System.out.println("Numbers divisble by 3 and 5 are:");
		for(num=startIndex;num<=endIndex;num++)
		{
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	void divisibleBy7or13(int startIndex, int endIndex){
		int num;
		System.out.println("Numbers divisble by 7 or 13 are:");
		for(num=startIndex;num<=endIndex;num++)
		{
			if(num%7==0){
				System.out.println(num +" is divible by 7");
				
			}else if(num%13==0){
				System.out.println(num +" is divible by 13");
			}		
		}
	}
	
	void sum(int startIndex, int endIndex){
		int num;
		int sum=0;
		for(num=startIndex;num<=endIndex;num++)
		{
			sum=sum+num;
		}
		System.out.println("Sum of numbers between 1 to 5 is " + sum);
	}
	
	void differenceBetweenSumOfOddAndEven(int startIndex, int endIndex){
		int num;
		int evenSum=0;
		int oddSum=0;
		for(num=startIndex;num<=endIndex;num++)
		{
			if(num%2==0){
			evenSum=evenSum+num;
			}else{
			oddSum=oddSum+num;
			}
			
		}
		int diffSum=oddSum-evenSum;
		System.out.println("Difference between sum of odd and even number is " + diffSum);
	}
	
	void oddNumbers(int startIndex, int endIndex){
		int num;
		System.out.println("Odd numbers are:");
		for(num=endIndex;num>=startIndex;num--)
		{
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment7 assignment7=new Assignment7();
		assignment7.evenNumbers(10,15);
		assignment7.divisibleBy5(10,30);
		assignment7.divisibleBy3and5(5,18);
		assignment7.divisibleBy7or13(5,40);
		assignment7.sum(1,5);
		assignment7.differenceBetweenSumOfOddAndEven(3,9);
		assignment7.oddNumbers(10,20);
		
	}

}
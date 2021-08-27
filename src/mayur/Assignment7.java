package mayur;
class Assignment7{
	
	void evenNumber(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++){
			if(index%2 == 0)
			System.out.println("Even number is :"+index);
		}
	}
	void numDivBy5(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++){
			if(index%5 == 0)
				System.out.println("Number Divisible by 5 is :"+index);
		}
	}
	void numDivBy5And3(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++){
			if(index%5==0 && index%3==0)
				System.out.println("Number is divisible by 5 and 3 is :"+index);
		}
	}
	void numDivBy7Or13(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++){
			if(index%7==0 || index%13==0)
				System.out.println("Number is divisible by 7 or 13 is :"+index);
		}
	}
	void sumOfAllNum(int startIndex, int endIndex){
		int sum=0;
		for(int index=startIndex; index<=endIndex; index++){
			sum = sum + index;
		}
		System.out.println("Sum of All Number is :"+sum);
	}
	void diffSumOfEvenAndOddNum(int startIndex, int endIndex){
		int sumOdd=0;
		int sumEven=0;
		int diff;
		for(int index=startIndex; index<=endIndex; index++){
			if(index%2 != 0){
				sumOdd = sumOdd + index;
			}else
				sumEven = sumEven + index;
		}
		diff = sumOdd-sumEven;
		System.out.println("Difference between Sum Of Odd and Sum of Even Number is :"+diff);
	}
	void oddNumReverse(int startIndex, int endIndex){
		for(int index=endIndex; index>=startIndex; index--){
			if(index%2 != 0)
				System.out.println("Reverse Odd Number is :"+index);
		}
	}
		
public static void main(String[] args){
	Assignment7 assignment7 = new Assignment7();
	assignment7.evenNumber(10,15);
	System.out.println("--------------");
	assignment7.numDivBy5(10,30);
	System.out.println("--------------");
	assignment7.numDivBy5And3(5,18);
	System.out.println("--------------");
	assignment7.numDivBy7Or13(5,40);
	System.out.println("--------------");
	assignment7.sumOfAllNum(1,5);
	System.out.println("--------------");
	assignment7.diffSumOfEvenAndOddNum(3,9);
	System.out.println("--------------");
	assignment7.oddNumReverse(10,20);
}

}		 
		 
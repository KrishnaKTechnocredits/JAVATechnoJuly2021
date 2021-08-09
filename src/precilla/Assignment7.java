package precilla;

public class Assignment7 {
	void printEvenNumbers(int startIndex,int endIndex) {
		for(int index=startIndex;index<=endIndex;index++) {
			if(index%2 ==0) {
				System.out.println(index);
			}
		}
	}
	void printNumberDivisibleBy5(int startIndex,int endIndex) {
		for(int index=startIndex;index<=endIndex;index++) {
			if(index%5==0) {
				System.out.println(index);
			}
		}
	}
	void printNumberDivisibleBy5And3(int startIndex,int endIndex) {
		for(int index=startIndex;index<=endIndex;index++) {
			if(index%5==0 && index%3==0) {
				System.out.println(index);
			}
		}
	}
	void printNumberDivisibleBy7Or13(int startIndex,int endIndex) {
		for(int index=startIndex;index<=endIndex;index++) {
			if(index%7==0) {
				System.out.println(index+" is divisible by 7");
			}
			if (index%13==0) {
				System.out.println(index+" is divisible by 13");
			}
		}
	}
	void sumOfNumbers(int startIndex,int endIndex) {
		int sum=0;
		for(int index=startIndex;index<=endIndex;index++) {
			sum= sum+index;
		}
		System.out.println("5.Sum is "+sum);
	}
	void differenceBetweenSumOfOddandEven(int startIndex,int endIndex) {
		int sum=0,oddSum=0,evenSum=0;
		for(int index=startIndex;index<=endIndex;index++) {
			if(index%2==0) {
				evenSum=evenSum+index;
			}else{
				oddSum=oddSum+index;
			}
		}
		sum=oddSum-evenSum;
		//System.out.println("sum of oddSum "+oddSum);
		//System.out.println("sum of evenSum "+evenSum);
		System.out.println("6.difference between sum of odd & even numbers are "+sum);
	}
	void printOddNumnbersInReverseOrder(int startIndex,int endIndex) {
		for(int index=endIndex;index>=startIndex;index--) {
			if(index%2!=0) {
			System.out.println(index);
			}
		}
	}
	public static void  main(String[] args) {
		 Assignment7 assignment7=new Assignment7();
		 System.out.println("1.Even Numbers are:");
		 assignment7.printEvenNumbers(10, 15);
		 System.out.println("2.Divisible by 5,numbers are:");
		 assignment7.printNumberDivisibleBy5(10, 30);
		 System.out.println("3.Divisible by 5 & 3, numbers are:");
		 assignment7.printNumberDivisibleBy5And3(5,18);
		 System.out.println("4.Divisible by 7 or 13, numbers are:");
		 assignment7.printNumberDivisibleBy7Or13(5,40);
		 assignment7.sumOfNumbers(1,5);
		 assignment7.differenceBetweenSumOfOddandEven(3, 9);
		 System.out.println("7.Odd Numbers in reverse order:");
		 assignment7.printOddNumnbersInReverseOrder(10, 20);
	}

}

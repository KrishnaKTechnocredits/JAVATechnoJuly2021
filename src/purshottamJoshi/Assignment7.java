package purshottamJoshi;

class Assignment7{
	
	void evenNumbers(int startNum, int endNum) {
		System.out.println("Even Numbers are :");
		for(int index = startNum; index <=endNum; index++) {
			if(index % 2 == 0) {
				
				System.out.println(index);
			}
		}
	}
	
	void divisibleFive(int startNum, int endNum) {
		System.out.println("Divisible by 5 numbers are:");
		for(int index = startNum; index <= endNum; index++) {
			if(index % 5 == 0) {
		System.out.println(index);
			}
		}
	}
	
	void divisibleFiveAndThree(int startNum, int endNum) {
		System.out.println("Divisible by 5 & 3 numbers are: ");
		for(int index = startNum; index <= endNum; index++) {
			if(index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
				
			}
		}
	}
	void divisibleSevenOr13(int startNum, int endNum) {
		for (int index = startNum; index <= endNum; index++) {
			if(index % 7 == 0) {
				System.out.println(index +" is divisible by 7 ");
			} else if(index % 13 == 0) {
				System.out.println(index+" is divisible by 13");
			}
		}
	}
	void sumOfNumbers(int startNum, int endNum) {
		int sum = 0;
		for(int index = startNum ; index <= endNum; index++) {
				sum = sum + index;
		}
		System.out.println("Sum of all numbers " +sum);
	}
	void addOddEvenNo(int startNum, int endNum) {
		int oddSum=0;
		int evenSum=0;
		int difference=0;
		for(int index = startNum; index <= endNum; index++) {
			if(index % 2 !=0) {
				oddSum = oddSum + index;
			} else if(index %2 == 0) {
				evenSum = evenSum + index;
			}
			
		}
		difference = oddSum - evenSum;
		System.out.println("Difference of odd even sum is:" +difference);
	}
	void oddNumbers(int startNum, int endNum) {
		for(int index = startNum; index >= endNum ; index--) {
			if(index % 2 != 0) {
				System.out.println("Only odd Number :" +index);
			}
		}
	}
	
	
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNumbers(1,10);
		assignment7.divisibleFive(10,30);
		assignment7.divisibleFiveAndThree(5, 18);
		assignment7.divisibleSevenOr13(5,40);
		assignment7.sumOfNumbers(1,5);
		assignment7.addOddEvenNo(3,9);
		assignment7.oddNumbers(20, 10);
	}
	
}

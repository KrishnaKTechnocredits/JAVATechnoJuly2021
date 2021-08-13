package tanmoy_Roy;

public class Assignment7 {
	
	//0.Method to Validate lowerLimit and upperLimit
	
	boolean validateRange(int lowerLimit,int upperLimit ) {
		if (lowerLimit<=upperLimit) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//1.Method to Print all even between lowerLimit and upperLimit
	void printEven(int lowerLimit,int upperLimit) {
		if (validateRange(lowerLimit,upperLimit)) {
			System.out.print("All Even Numbers between "+lowerLimit+" and "+upperLimit+" are: ");
			if (lowerLimit%2==1) {
				lowerLimit+=1;
			}
			for(int i=lowerLimit;i<=upperLimit;i+=2 ) {
					System.out.print(i+" ");
			}
		}
		else {
			System.out.println("Lower bound is greater than Upper bound Invalid Entry");
		}
		
	}
	//2.Method to Print all numbers divisible by 5 between lowerLimit and upperLimit
	void numberDivisibleByfive(int lowerLimit,int upperLimit) {
		if (validateRange(lowerLimit,upperLimit)) {
			System.out.print("All Numbers between "+lowerLimit+" and "+upperLimit+" divisible by 5 are: ");
			if(lowerLimit%5!=0) {
				lowerLimit+=5-(lowerLimit%5);
			}
			for(int i=lowerLimit;i<=upperLimit;i+=5 ) {
					System.out.print(i+" ");
				}
		}
		else {
			System.out.println("Lower bound is greater than Upper bound Invalid Entry");
		}
	}
	
	//3.Method to Print all numbers divisible by 5 & 3 between lowerLimit and upperLimit
		void numberDivisibleByfiveAndThree(int lowerLimit,int upperLimit) {
			if (validateRange(lowerLimit,upperLimit)) {
				System.out.print("All Numbers between "+lowerLimit+" and "+upperLimit+" divisible by 5 & 3 are: ");
				for(int i=lowerLimit;i<=upperLimit;i++ ) {
					if(i%5==0 && i%3==0) {
							System.out.print(i+" ");
					}
				}
			}
			else {
				System.out.println("Lower bound is greater than Upper bound Invalid Entry");
			}
		}
		
	//4.Method to Print all numbers divisible by 5 & 3 between lowerLimit and upperLimit
	void numberDivisibleBySevenOrThirteen(int lowerLimit,int upperLimit) {
		if (validateRange(lowerLimit,upperLimit)) {
			System.out.print("All Numbers between "+lowerLimit+" and "+upperLimit+" divisible by 7 or 13 are: ");
			for(int i=lowerLimit;i<=upperLimit;i++ ) {
				if(i%7==0 || i%13==0) {
						System.out.print(i+" ");
				}
			}
		}
		else {
			System.out.println("Lower bound is greater than Upper bound Invalid Entry");
		}
	}
	
	//5.Method to Sum all numbers between lowerLimit and upperLimit
	void sumNumbersBetweenRange(int lowerLimit,int upperLimit) {
		int Sum=0;
		if (validateRange(lowerLimit,upperLimit)) {
			for(int i=lowerLimit;i<=upperLimit;i++ ) {
				Sum+=i;
			}
			System.out.print("Sum of Numbers between "+lowerLimit+" and "+upperLimit+" is: "+Sum);
		}
		else {
			System.out.println("Lower bound is greater than Upper bound Invalid Entry");
		}
	}
	//6.Method to difference between Odd and Even numbers between lowerLimit and upperLimit
	void diffBetweenOddAndEven(int lowerLimit,int upperLimit) {
		int diff=upperLimit-lowerLimit,Sum=0;
		if (validateRange(lowerLimit,upperLimit)) {
			if (diff%2==1) {			// if difference is odd there are exactly diff/2+1 many pairs
				Sum=diff/2+1;
			}
			else {
				Sum=upperLimit-diff/2;  // if difference  is Even there are exactly diff/2+1 many pairs minus Upperlimit number left
			}
			System.out.print("Difference of Numbers between "+lowerLimit+" and "+upperLimit+" is: "+Sum);
		}
		else {
			System.out.println("Lower bound is greater than Upper bound Invalid Entry");
		}
	}
	
	//7.Method to Print Odd between lowerLimit and upperLimit in reverse order
		void printOddInReverse(int lowerLimit,int upperLimit) {
			
			System.out.print("All Odd Numbers between "+lowerLimit+" and "+upperLimit+" in Reverse order: ");
			if (validateRange(lowerLimit,upperLimit)) {
				
				if (upperLimit%2==0) {
					upperLimit-=1;
				}
				for(int i=upperLimit;i>=lowerLimit;i-=2 ) {
					System.out.print(i+" ");
				}
			}
			else {
				System.out.println("Lower bound is greater than Upper bound Invalid Entry");
			}
		}

	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		
		assignment7.printEven(10,15);
		System.out.println("");
		assignment7.numberDivisibleByfive(10,30);
		System.out.println("");
		assignment7.numberDivisibleByfiveAndThree(5,18);
		System.out.println("");
		assignment7.numberDivisibleBySevenOrThirteen(5,40);
		System.out.println("");
		assignment7.sumNumbersBetweenRange(1,5);
		System.out.println("");
		assignment7.diffBetweenOddAndEven(3,9);
		System.out.println("");
		assignment7.printOddInReverse(10,20);
		
	}

}

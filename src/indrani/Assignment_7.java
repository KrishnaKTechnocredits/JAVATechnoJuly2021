package indrani;

public class Assignment_7 {
	
	
	boolean validateRange(int lowerLimit,int upperLimit ) {
		if (lowerLimit<=upperLimit) {
			return true;
		}
		else {
			return false;
		}
	}
	
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
		Assignment_7 assignment_7 = new Assignment_7();
		
		assignment_7.printEven(12,17);
		System.out.println("");
		assignment_7.numberDivisibleByfive(20,30);
		System.out.println("");
		assignment_7.numberDivisibleByfiveAndThree(15,20);
		System.out.println("");
		assignment_7.numberDivisibleBySevenOrThirteen(5,40);
		System.out.println("");
		assignment_7.sumNumbersBetweenRange(1,5);
		System.out.println("");
		assignment_7.diffBetweenOddAndEven(3,9);
		System.out.println("");
		assignment_7.printOddInReverse(10,20);
		
	}

}

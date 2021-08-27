package aniket;

public class Assignment_7 {

	void evenNumbers(int startindex, int endindex) {
		System.out.println("Even numbers are : ");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}

		}

	}
	
	void divisibleByFive(int startindex, int endindex) {
		System.out.println("Numbers divisible by 5 :");
		for(int index=startindex;index<=endindex;index++) {
			if(index%5==0) {
				System.out.println(index);
			}
			
		}
		
	} 
	
	void divisibleByThreeAndFive(int startindex, int endindex) {
		System.out.println("Numbers divisible by 5 & 3 are :");
		for(int index=startindex;index<=endindex;index++) {
			if(index%3==0 && index%5==0) {
				System.out.println(index);
			}
			
		}
		
	}
	
	void divisibleBySevenOrThirteen(int startindex, int endindex) {
		System.out.println("Numbers divisible by 7 or 13 are :");
		for(int index=startindex;index<=endindex;index++) {
			if(index%7==0 || index%13==0) {
				System.out.println(index);
			}
			
		}
		
	}
	
	void sumOfNumbers(int startindex, int endindex) {
		int sum = startindex;
		for(int index = startindex ; index<=endindex; index++)
			sum = sum + index;
		System.out.println("\nSum is " + sum);
	}
	
	void differenceSumofOddandEven(int startindex, int endindex) {
		int sumeven = startindex;
		int sumodd = startindex;
		int difference = 0;
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 2 == 0)
				sumeven = sumeven + index;
			else
				sumodd = sumodd + index;
			
			difference = sumodd - sumeven;
		}
		System.out.println("\nDifference between sum of odd and even numbers: " + difference);
	}
	
	void reverseoddnumbers(int startindex, int endindex) {

		System.out.println("\nReverse odd numbers are:");
		for(int index = endindex ; index >= startindex; index--) {
			if(index % 2 != 0)
				System.out.println(index);
		}
	}
	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.evenNumbers(10, 15);
		assignment_7.divisibleByFive(10, 30);
		assignment_7.divisibleByThreeAndFive(5, 18);
		assignment_7.divisibleBySevenOrThirteen(5, 40);
		assignment_7.sumOfNumbers(1,5);
		assignment_7.differenceSumofOddandEven(3, 9);
		assignment_7.reverseoddnumbers(10, 20);
	}

}

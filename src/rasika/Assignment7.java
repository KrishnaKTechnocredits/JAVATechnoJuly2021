package rasika;

public class Assignment7 {

	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are ");
		for(;startIndex <= endIndex; startIndex++) {
			if(startIndex % 2 == 0) {
				System.out.println(startIndex);
			}
		}
	}
	void divisibleby5(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 are ");
		for(;startIndex <= endIndex; startIndex++) {
			if(startIndex % 5 == 0) {
				System.out.println(startIndex);
			}
		}
	}
	void divisibleby5And3(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 and 3 are ");
		for(;startIndex <= endIndex; startIndex++) {
			if(startIndex % 5 == 0 && startIndex % 3 ==0) {
				System.out.println(startIndex);
			}
				
		}
	}
	void divisibleby7Or13(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 7 and 13 are ");
		for(;startIndex <= endIndex; startIndex++) {
			if(startIndex % 7 == 0) 
				System.out.println(startIndex+" divisible by "+7);
			else if(startIndex % 13 == 0)
				System.out.println(startIndex+" divisible by "+13);
		}
	}
	void total(int startIndex, int endIndex) {
		int sum = 0;
		for(;startIndex <= endIndex; startIndex++) {
			sum= sum + startIndex;
		}
		System.out.println("Sum is "+sum);
	}
	void diffBetweenOddAndEvenNum(int startIndex, int endIndex) {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for(;startIndex <= endIndex; startIndex++) {
			if(startIndex % 2 == 0)
			    sumOfEven = sumOfEven + startIndex;
			else
				sumOfOdd = sumOfOdd + startIndex;
		}
		int diff = sumOfOdd - sumOfEven;
		System.out.println("Difference between Even and odd is "+diff);
	}
	void reverseOddNum(int startIndex, int endIndex) {
			for(;endIndex >= startIndex; endIndex--) {
				if  (endIndex % 2 != 0) {
				System.out.println(endIndex);
			}
		}
	//	System.out.println("Odd numbers in reverse order are "+endIndex);
	}
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumbers(10,15);
		assignment7.divisibleby5(10,30);
		assignment7.divisibleby5And3(5,18);
		assignment7.divisibleby7Or13(5,40);
		assignment7.total(1,5);
		assignment7.diffBetweenOddAndEvenNum(3,9);
		assignment7.reverseOddNum(10,20);
	}
	
	
}

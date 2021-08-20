package devendra_c;

public class ForLoopA7 {
		
		void printEven(int startIndex , int endIndex){
			System.out.println("Even Numbers are :- ");
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 2 == 0){
				System.out.println(index);
			}
		}
	}	

	void divisibleBy5(int startIndex , int endIndex){
		System.out.println("Divisible by 5 numbers are :-");
		for (int index = startIndex; index <= endIndex ; index++){
				if (index % 5 == 0)
			System.out.println(index);
		}
	}

	void divisibleBy5n3(int startIndex , int endIndex){
		System.out.println("Divisible by 5 & 3 numbers are :-");
		for (int index = startIndex; index <= endIndex ; index++){
				if (index % 5 == 0 && index % 3 == 0)
			System.out.println(index);
		}
	}	

	void divisibleBy7or13(int startIndex , int endIndex){
		System.out.println("Divisible by 7 or 13 numbers are :-");
		for(int index = startIndex; index < endIndex + 1; index++){
			if (index % 7 == 0){
				System.out.println(index + "divisible by 7");
			}else if (index % 13 == 0){
				System.out.println(index + "divisible by 13");
			}
		}
	}

	void sumOfAllNo(int startIndex , int endIndex){
		int sum = 0;
		for (int index = startIndex; index <= endIndex ; index++){
				sum = sum + index;
		}	
			System.out.println("Sum of 1 to 5 numbers are :- " + sum);

	}

	void diffBetnOddAndEvenSum(int startIndex , int endIndex){
		int evenSum = 0;
		int	oddSum	= 0;	
		for (int index = startIndex; index <= endIndex ; index++){
				if (index % 2 == 0){
					evenSum = evenSum + index;	
				}else
				{
					oddSum = oddSum + index;
				}	
		}
		int findDiff = oddSum - evenSum;
		System.out.println("The difference between Odd Sum & Even Sum = " + findDiff);
	}

	void reverseOddNos(int startIndex , int endIndex){
		System.out.println("Reverse Odd Numbers are :- ");
		for (int index = startIndex; index >= endIndex ; index--){
				if (index % 2 != 0)
			System.out.println(index);
		}
	}	
	public static void main (String[] a){
			ForLoopA7 a7 = new ForLoopA7();
			a7.printEven(10,15);
			a7.divisibleBy5(10,30);
			a7.divisibleBy5n3(5,18);
			a7.divisibleBy7or13(5,40);
			a7.sumOfAllNo(1,5);
			a7.diffBetnOddAndEvenSum(3,9);
			a7.reverseOddNos(20,10);
	}
}

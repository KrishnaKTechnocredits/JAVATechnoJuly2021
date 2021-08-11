package tarang;

public class Assignment_7_1 {
	
		void evenNumbers(int startIndex, int endIndex){
			for(int index= startIndex; index<=endIndex; index++){
				if(index%2==0){
					System.out.println(index);
				}
			}
		}
		
		void divisibleBy5(int startIndex, int endIndex){
			for(int index= startIndex; index<=endIndex; index++){
				if(index%5==0){
					System.out.println(index);
				}
			}
		}
		
		void divisibleBy5And3(int startIndex, int endIndex){
			for(int index= startIndex; index<=endIndex; index++){
				if (index%5 == 0 && index%3 == 0){
					System.out.println(index);
				}
			}
		}
		
		void divisibleBy7Or3(int startIndex, int endIndex) {
			for(int index=startIndex; index<=endIndex; index++) {
				if (index%7 == 0)
					System.out.println(index + " is divisible by 7");
				else if (index%13 == 0)
					System.out.println(index + " is divisible by 13");
				
			}
		}
		
		void addition (int startIndex, int endIndex) {
			int sum=0;
			for(int index=startIndex; index<=endIndex; index++) {
				sum = sum + index;
			}
			System.out.println("Sum of numbers is: " + sum);
		}
		
		void difference(int startIndex, int endIndex) {
			int diff,sumEven=0,sumOdd=0;
			for(int index=startIndex; index<=endIndex; index++) {
				if (index%2 != 0)
					sumOdd = sumOdd + index;
				else
					sumEven = sumEven + index;
			}
			diff= sumOdd - sumEven;
			System.out.println("Difference is: " + diff);
		}
		
		void printOddNumbersReverse(int startIndex, int endIndex) {
			for(int index=startIndex; index>=endIndex; index--) {
				if (index%2 != 0)
					System.out.println(index);
			}
		}

		public static void main(String[] args) {
			Assignment_7_1 assignment_7_1 = new Assignment_7_1();
			System.out.println("Even numbers are:");
			assignment_7_1.evenNumbers(10, 15);
			System.out.println("Divisible by 5, numbers are:");
			assignment_7_1.divisibleBy5(10, 30);
			System.out.println("Divisible by 5 & 3, numbers are:");
			assignment_7_1.divisibleBy5And3(5, 18);
			System.out.println("Divisible by 7 or 13, numbers are:");
			assignment_7_1.divisibleBy7Or3(5, 40);
			assignment_7_1.addition(1, 5);
			assignment_7_1.difference(3, 9);
			System.out.println("Odd Numbers in reverse order :");
			assignment_7_1.printOddNumbersReverse(20, 10);
		}

	}


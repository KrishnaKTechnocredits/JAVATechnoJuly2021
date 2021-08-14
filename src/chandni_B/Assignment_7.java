package chandni_B;

class Assignment_7{

	void displayEvenNumbers (int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.print (index + " , ");
			}
		}
		{System.out.println ("are even numbers");
		System.out.println ( "----------------------------------------------");}
	}

	void divisibleBy5 (int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.print (index + " , ");
			}
		}
		{ 	System.out.println ("are divisible by 5");
		System.out.println ( "----------------------------------------------"); }
	}


	void divisibleBy5And3 (int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println ("Number divisible by 5 and 3 is " + index);
			}
		}
		{ System.out.println ( "----------------------------------------------"); }
	}


	void divisibleBy7Or13 (int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println ("Number divisible by 7  is " + index);
			} else if (index % 13 == 0) {
				System.out.println ("Number divisible by 13 is " + index);

			}
		}
		{ System.out.println ( "----------------------------------------------"); }
	}


	void sumOfAllNumbers (int startIndex, int endIndex) {
		int exm = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			exm = exm + index;
		}
		System.out.println("Sum of all numbers is " + exm);

		System.out.println ( "----------------------------------------------"); }



	void diffBetweenSumOfOddAndEven (int startIndex, int endIndex) {
		int odd= 0;
		int even = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 != 0) {
				odd = odd + index;
			} else {
				even = even + index;
			}
		}
		int diff = odd - even;
		System.out.println ("Difference between sum of odd and even numbers is " + diff);

		{ System.out.println ( "----------------------------------------------"); }
	}

	void oddNumberInReverseOrder (int startIndex, int endIndex) {
		for (int index = endIndex; index>= startIndex; index--) {
			if (index % 2 != 0) {
				System.out.print (index + " , ");
			}
		}
		{System.out.println ("reverse order of odd number");
		System.out.println ( "----------------------------------------------"); }	
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7 ();
		assignment_7.displayEvenNumbers(10,15);
		assignment_7.divisibleBy5(10,30);
		assignment_7.divisibleBy5And3(5,18);
		assignment_7.divisibleBy7Or13(5,40);
		assignment_7.sumOfAllNumbers(1,5);
		assignment_7.diffBetweenSumOfOddAndEven(3,9);
		assignment_7.oddNumberInReverseOrder(10,20);

	}
	
}



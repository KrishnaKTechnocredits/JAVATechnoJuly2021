package sagar_Anasane;

class Assignment7{
	void printEvenNo(int startIndex , int endIndex){
		for (startIndex = 10; startIndex <= 15 ; startIndex++){
				if (startIndex % 2 == 0)
			System.out.println(startIndex);
		}
	}	
	
	void divisibleBy_5(int startIndex , int endIndex){
		System.out.println("Divisible by 5 nos are ...");
		for (startIndex = 10; startIndex <= 30 ; startIndex++){
				if (startIndex % 5 == 0)
			System.out.println(startIndex);
		}
	}
	
	void divisibleBy_FiveAndThree(int startIndex , int endIndex){
		System.out.println("Divisible by 5 & 3 nos are ...");
		for (startIndex = 5; startIndex <= 18 ; startIndex++){
				if (startIndex % 5 == 0 && startIndex % 3 == 0)
			System.out.println(startIndex);
		}
	}	
	
	void divisibleBy_SevenOrThirteen(int startIndex , int endIndex){
		for (startIndex = 5; startIndex <= 40 ; startIndex++){
				if (startIndex % 7 == 0 || startIndex % 13 == 0)
			System.out.println(startIndex + "is Divisible by " + startIndex);
		}
	}
	
	void findSumOfAllNos(int startIndex , int endIndex){
		int sum = 0;
		for (startIndex = 1; startIndex <= 5 ; startIndex++){
				sum = sum + startIndex;
		}	
			System.out.println("Output : Sum is " + sum);
		
	}
	
	void findDiffBetweenSumOddAndEven(int startIndex , int endIndex){
		int sumEven = 0;
		int	sumOdd	= 0;	
		for (startIndex = 3; startIndex <= 9 ; startIndex++){
				if (startIndex % 2 == 0){
					sumEven = sumEven + startIndex;	
				}else
				{
					sumOdd = sumOdd + startIndex;
				}	
		}
		int findDiff = sumOdd - sumEven;
		System.out.println("Output =" + findDiff);
	}

	void reverseOddNos(int startIndex , int endIndex){
		for (startIndex = 20; startIndex >= 10 ; startIndex--){
				if (startIndex % 2 != 0)
			System.out.println(startIndex);
		}
	}	
	public static void main (String[] a){
			Assignment7 assignment7 = new Assignment7();
			assignment7.printEvenNo(10,15);
			assignment7.divisibleBy_5(10,30);
			assignment7.divisibleBy_FiveAndThree(5,18);
			assignment7.divisibleBy_SevenOrThirteen(5,40);
			assignment7.findSumOfAllNos(1,5);
			assignment7.findDiffBetweenSumOddAndEven(3,9);
			assignment7.reverseOddNos(20,10);
	}
}
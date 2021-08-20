package chandani;

class Assignment7{
	
	int index = 0;
	void findEvenOdd(int startindex, int endindex){
		System.out.println("Even numbers are ");
		for (index = startindex; startindex <= endindex; startindex++){	
			if (startindex%2==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisibleBy5(int startindex, int endindex){
		System.out.println("\nDivisible by 5 numbers are: ");
		for (index = startindex; startindex <= endindex; startindex++){	
			if (startindex%5==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisibleBy5and3(int startindex, int endindex){
		System.out.println("\nDivisible by 5 and 3, numbers are: ");
		for (index = startindex; startindex <= endindex; startindex++){	
			if (startindex%5==0 && startindex%3==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisibleBy7or13(int startindex, int endindex){
		System.out.println("\nDivisible by 7 or 13, numbers are: ");
		for (index = startindex; startindex <= endindex; startindex++){	
			if (startindex%7==0){
				System.out.println(startindex +" is divisible by 7" );
			}else if (startindex%13==0){
				System.out.println(startindex +" is divisible by 13" );
			}
		}
	}
	
	void sumOfNumbers(){
		int sum = 0;
		int num = 5;
		for (int index = 1; index <= num; index++){	
				sum = sum + index;
			}
			System.out.println("\nSum of numbers is " +sum );
	}
	
	void oddEvenDiff(int startindex, int endindex){
		int sumeven = 0;
		int sumodd = 0;
		int diff;
		for (index = startindex; startindex <= endindex; startindex++){	
			if (startindex%2==0){
				sumeven = sumeven + startindex;
			}else if(startindex%2!=0){
				sumodd = sumodd + startindex;		
			}
		}	
		diff = sumodd - sumeven;
		System.out.println("\nDifference between sum of odd numbers and even numbers " +diff +"\n");
	}
	
	void oddNumbersReverse(int startindex, int endindex){
		for (index = endindex; startindex <= endindex; endindex--){	
			if(endindex%2!=0){
				System.out.println(+endindex);
			}
		}	
	}
	
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.findEvenOdd(10,15);
		assignment7.divisibleBy5(10,30);
		assignment7.divisibleBy5and3(5,18);
		assignment7.divisibleBy7or13(5,40);
		assignment7.sumOfNumbers();
		assignment7.oddEvenDiff(3,9);
		assignment7.oddNumbersReverse(10,20);

	}
}
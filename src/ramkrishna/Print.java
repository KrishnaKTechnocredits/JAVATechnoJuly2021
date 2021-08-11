package ramkrishna;

public class Print {

	
	void evenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers are");
		for (int index=startIndex; index <=endIndex; index++) {
			if(index % 2 == 0) {
				System.out.println(index);
			}
		}
		
	}

	void divisiblebyFive (int startindex, int endindex ) {
		System.out.println("\n Divisible by 5 Numbers are : " );
		for (int index= startindex; index<=endindex; index++) {
			if (index%5==0) {
				System.out.println(index);
			}
		}
		
	}
	
	
	void divisibleFiveandThree(int startindex, int endindex) {
		System.out.println("\n Divisible by 5 and 3 numbers are :");
		for (int index=startindex;index<=endindex;index++)
				if(index%3==0 && index%5==0) {
					System.out.println(index);
			}
	}
	
	void divisibleFiveorThireen(int startindex, int endindex) {
		System.out.println("\n Divisible by 7 or 13 number are: ");
		for (int index=startindex;index<=endindex;index++) {
			if(index%7==0 || index%13==0) {
				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
				} else if (index % 13 == 0) {
					System.out.println(index + " is divisible by 13");
				}
		
			}
		}
	}
	
	void sum(int startindex, int endindex) {
		System.out.println("\n Sum of all the numbers ");
		int sum=0;
		for (int index=startindex;index<=endindex; index++)
		{
			sum=sum+index;
		} 
		System.out.println(sum);
	}
		
	void diffSumOfOddEven(int startindex, int endindex) {
		System.out.println("Difference between sum of odd numbers and even numbers");
		int sumodd = 0;
		int sumeven = 0;
		int sum = 0;
		
		for (int index=startindex; index<=endindex; index++) {
			
			if (index % 2 == 0) {
				sumeven = sumeven + index;
			} else {
				sumodd = sumodd + index;
			}
			sum = sumodd - sumeven;	
		}
		System.out.println(sum);
	}
	
	void reverseOrder(int startindex, int endindex) {
		System.out.println("odd numbers in reverse order.:");
		for (int index = startindex; index >= endindex; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   Print print= new Print();
		   print.evenNumber(10,15);
		   print.divisiblebyFive(10,30);
		   print.divisibleFiveandThree(5, 18);
		   print.divisibleFiveorThireen(5, 40);
		   print.sum(1,5);
		   print.diffSumOfOddEven(3,9);
		   print.reverseOrder(20, 10);

	}

}

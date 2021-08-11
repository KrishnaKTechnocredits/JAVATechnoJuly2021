package jagrati;

public class Assignment_7{
	
	void displayEvenNumber(int startIndex, int endIndex ){
		int index = 0;
		System.out.println("----------First method output-----");	
		for (index = startIndex; index<=endIndex; index++){
			if (index%2 == 0){	
			System.out.println("Print even number " + index);
			}
		}	
	}void printDivisibleNumber(int startIndex, int endIndex ){
		int index = 0;
		System.out.println("----------Second method output-----");		
		for(index = startIndex; index<=endIndex; index++){
			if (index%5 == 0){
			System.out.println("Print Divisible by 5 " + index);
			
			}
		}		
	}void printDivisibleByTwoNumber(int startIndex, int endIndex ){
		int index = 0;
		System.out.println("----------Third method output-----");
			for(index = startIndex; index<=endIndex; index++){
				if(index%5==0 && index%3 == 0){
				System.out.println("Divisble by 3 and 5 " + index);
			}		
		}	
	}void printDivisibleByTwoOrNumber(int startIndex, int endIndex){
		int index = 0;
		System.out.println("----------Fourth method output-----");
			for(index = startIndex; index<=endIndex; index++){
				 if (index%7 ==0){
					System.out.println("7 Divisble by " + index );
				}else if (index%13==0){
					System.out.println("13 Divisble by " + index );
				}
		    }	
	}void sumOfNumber(int startIndex, int endIndex){
		int sum =0;
		int index = 1;		
		System.out.println("----------Fifth method output-----");
		for(index = startIndex; index<=endIndex; index++){
			sum = sum + index;
		}
			System.out.println("Total number of sum is " + sum );
	}void sumOfOddEvenNumber(int startIndex, int endIndex){
		int evenSum = 0;
		int oddSum = 0;
		int index =3;
		int total;
		System.out.println("----------Six method output-----");
		for(index = startIndex; index<=endIndex; index++){
			if (index%2 !=0){
				oddSum = oddSum + index; // 3 + 5 +7+9
			}
			else 
			{			
				evenSum = evenSum + index;// 4 + 6 + 8
			}
		} 	total = oddSum - evenSum;
			System.out.println("difference between sum of odd numbers and even numbers "+ total );
	
	}void reverseOrderNumber(int startIndex, int endIndex){
		int index =0;
		System.out.println("----------Seventh method output-----");
		for(index = startIndex; index>=endIndex; index--){
			if (index%2 !=0){
				System.out.println("Print odd numbers " + index);
			}
			
		}
	}
	public static void main(String []args){
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.displayEvenNumber(10,15);
		assignment_7.printDivisibleNumber(10,30);
		assignment_7.printDivisibleByTwoNumber(5,18);
		assignment_7.printDivisibleByTwoOrNumber(5,40);
		assignment_7.sumOfNumber(1,5);
		assignment_7.sumOfOddEvenNumber(3,9);
		assignment_7.reverseOrderNumber(20,10);
		
	}
}






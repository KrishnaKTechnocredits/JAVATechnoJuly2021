package bhakti;

public class Assignment_7 {
	
	void printEvenNum_1(int startRange, int endRange){
		System.out.println("Belwo are even number between "+startRange+" & "+endRange);
		for (int index=startRange; index<= endRange; index++){
			if (index%2 == 0)
			System.out.println(index);
		}
		System.out.println("=========================");
	}
	
	void printNumDivisibleBy5_2(int startRange, int endRange){
		System.out.println("Belwo are number between " +startRange+" to "+ endRange+" divisible by 5");
		for (int index=startRange; index<= endRange; index++){
			if (index%5 == 0)
			System.out.println(index);
		}
		System.out.println("=========================");
	}
	
	void printNumDivisibleBy5and3_3(int startRange, int endRange){
		System.out.println("Belwo are number between " +startRange+" to "+ endRange+ " divisible by both 5 & 3 :" );
		for (int index=startRange; index<= endRange; index++){
			if (index%3 == 0 && index%5 ==3)
			System.out.println(index);					
			
			}	
		System.out.println("=========================");	
	}
	
	void printNumDivisibleBy7or13_4(int startRange, int endRange){
		System.out.println("Belwo are number between " +startRange+" to "+ endRange+" divisible by 7 or 13:" );
		for (int index=startRange; index<= endRange; index++){
			if (index%7 == 0)
			System.out.println(index +" is divisible by 7");	
			if (index%13 == 0)
			System.out.println(index +" is divisible by 13");					
			
			}	
		System.out.println("=========================");	
	}
	
	void sumOfNum_5(int startRange, int endRange){
		int sum=0;
		System.out.println("Belwo is sum of numbers between " +startRange+" to "+ endRange );
		for ( int index= startRange; index <=endRange; index++){
			sum += index;
		}	
		System.out.println(sum);	
		System.out.println("=========================");		
	}	
	
	void printDifference_6(int startRange, int endRange){
		int sumEvnNumber=0;	
		int sumOddNumber=0;
		int index;
		
		for  (index= startRange; index <= endRange; index++){
			
				if (index%2!=0)
					sumOddNumber= sumOddNumber+ index;
				else 
					sumEvnNumber=sumEvnNumber + index;
		}
		int difference=0;
		if (sumOddNumber >=sumEvnNumber)
			difference= sumOddNumber-sumEvnNumber;
		else 
			difference= sumEvnNumber-sumOddNumber;
		System.out.println("Difference between sum of odd numbers: " + sumOddNumber+ " and even numbers "+sumEvnNumber+"  in a given range: " );	
		System.out.println(difference);
		System.out.println("=========================");	
	  }	
	
	void printOddNumReverseOrder_7(){
		System.out.println("Odd numbers in reverse order : ");
		for (int index= 20; index >=10; index--){
			if (index%2 !=0)
				System.out.println(index);
		}	
		System.out.println("=========================");
     }	
	

	public static void main(String[] args) {
		Assignment_7 assignment_7= new Assignment_7();
		assignment_7.printEvenNum_1(-2, 10);
		assignment_7.printNumDivisibleBy5_2(-20, 10);
		assignment_7.printNumDivisibleBy5and3_3(5, 20);
		assignment_7.printNumDivisibleBy7or13_4(5, 50);
		assignment_7.sumOfNum_5(-1, 4);
		assignment_7.printDifference_6(-6, 5);
		assignment_7.printOddNumReverseOrder_7();
		
	}

}

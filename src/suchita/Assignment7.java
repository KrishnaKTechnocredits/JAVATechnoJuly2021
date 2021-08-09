package suchita;

class Assignment7{
	
	void printEvenNumber(int start_index,int end_index) {
		System.out.println("Even Number :: ");
		for(int index=start_index ; index <= end_index ; index++){
			if(index%2 == 0) {
				System.out.println(index);
			}
		}
	}
	
	void printDivided_by_5(int start_index,int end_index) {
		System.out.println("\n Number divided by 5 :: ");
		for(int index=start_index ; index <= end_index ; index++) {
			if(index%5 == 0) {
				System.out.println(index);
			}
		}
	}
	
	void printDivided_by_3_and_5(int start_index,int end_index) {
		System.out.println("\n Number divided by 3 & 5 :: ");
		for(int index=start_index ; index <= end_index ; index++) {
			if(index%3 == 0 && index%5 == 0) {
					System.out.println(index);							}
		}
	}
	
	void printDivided_by_7_or_13(int start_index,int end_index) {
		System.out.println("\n Divided by 7 n 13 ");
		for(int index=start_index ; index <= end_index ; index++) 
			if(index%7 == 0 || index%13 == 0) {
				if(index%7 == 0) 
					System.out.println(index + " is divisible by 7" );
					else {
					System.out.println(index + " is divisible by 13" );}
					
				
			}
		
	}
	
	void sumOfNumbers(int start_index,int end_index) {
		System.out.println("\n Sum of the given range :: ");
		int sum=0;
		for(int index=start_index ; index <= end_index ; index++) {
			 sum=sum + index;
		}
		System.out.println(sum);
	}
	
	void difference_odd_even(int start_index,int end_index) {
		System.out.println("Difference of odd and even number :: ");
		int sum_even=0;
		int sum_odd=0;
		int diff=0;
		for(int index=start_index ; index <= end_index ; index++){
			if(index%2 == 0) {
				sum_even=sum_even+index;
			}
			else if(index%2 != 0) {
				sum_odd=sum_odd+index;
			}
		}
		diff = sum_odd - sum_even;
		System.out.println(diff);
	}
	
	void oddNumberReverse(int start_index,int end_index) {
		System.out.println("\n Odd number in reverse order :: ");
		for(int index=end_index ; index >= start_index ; index--) {
			if(index%2 != 0) 
			System.out.println(index); 
		
		}
	}			
	
	public static void main(String[] args){
		
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumber(10,15);
		assignment7.printDivided_by_5(10,30);
		assignment7.printDivided_by_3_and_5(5,18);
		assignment7.printDivided_by_7_or_13(5,40);
		assignment7.sumOfNumbers(1,5);
		assignment7.difference_odd_even(3,9);
		assignment7.oddNumberReverse(10,20);
	}	
	
}

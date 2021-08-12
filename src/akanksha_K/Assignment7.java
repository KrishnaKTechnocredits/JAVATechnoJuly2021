package akanksha_K;

public class Assignment7 {
	
	void evenNumber (int startindex, int endindex){
		System.out.println("Even numbers are:");
		
		for (int index=startindex; index<=endindex; index++){
			if (index%2==0){
				System.out.println(index);
			}
		}
		System.out.println();
	}
	
	void divisibleBy5 (int startindex, int endindex){
		System.out.println("Divisible by 5, numbers are:");
		
		for (int index=startindex; index<=endindex; index++){		
		    if (index%5==0){
			    System.out.println(index);
			}
		}
		System.out.println();
	}	
	
	void divisibleBy5And3 (int startindex, int endindex){
		for (int index=startindex; index<=endindex; index++){		
		    if (index%5==0&&index%3==0){
			    System.out.println("Divisible by 5 and 3, numbers are: "+index);
			}
		}
		System.out.println();
	}	
	
	void divisibleBy7And13 (int startindex, int endindex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		
		for (int index=startindex; index<=endindex; index++){		
		    if (index%7==0){
			   System.out.println(index + " is Divisible by 7");
			}
		
		    else if(index%13==0) {
			     System.out.println(index + " is Divisible by 13");
		    }
	     }
		System.out.println();
	}	
	
	void sum() {
		int result= 0;
		   for (int index=1; index<=5;  index++) {		
			result = result + index;
		   }
			    System.out.println("Sum is " +  result);
			    System.out.println();	
	}
	
	
	void diffEvenOdd(int startindex, int endindex) {
		int evenSum=0;
		int oddSum=0;
		
		for (int i=startindex; i<=endindex; i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}
			else if(i%2!=0) {
				oddSum=oddSum+i;
				}
			}
		
		System.out.println("Even Sum is " + evenSum);
		System.out.println("Odd Sum is " +  oddSum);
		
		
		int result= oddSum - evenSum;
		
		System.out.println("Difference between even and odd is " +  result);
		System.out.println();
		
	}
	
	void oddReverse(int startindex, int endindex) {
		for (int i=endindex; i>=startindex; i--) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
		
	public static void main(String[] args){

		Assignment7 assignment7= new Assignment7();
		assignment7.evenNumber(10,15);
		assignment7.divisibleBy5(10,30);
		assignment7.divisibleBy5And3(5,18);
		assignment7.divisibleBy7And13(5,40);
		assignment7.sum();
		assignment7.diffEvenOdd(3,9);
		assignment7.oddReverse(10,20);

	}
}

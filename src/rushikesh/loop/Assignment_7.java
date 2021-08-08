package rushikesh.loop;

public class Assignment_7 {
	void evenNum(int startIndex,int endIndex){
		System.out.println("Even numbers are ");
		for(int index=startIndex;index<=endIndex;index++) {	
			if(index%2==0) {
				System.out.println(index);
			}
				
		}
		System.out.println("---------------------------------------------");
	}	
	
	void divBy5(int startIndex,int endIndex){
		System.out.println("Numbers which are divisible by 5 are ");
		for(int index=startIndex;index<=endIndex;index++) {	
			if(index%5==0) {
				System.out.println(index);
			}
				
		}
		System.out.println("---------------------------------------------");
	}
	
	void divBy5And3(int startIndex,int endIndex){
		System.out.println("Numbers which are divisible by 5 and 3 are ");
		for(int index=startIndex;index<=endIndex;index++) {	
			if(index%3==0 && index%5==0) {
				System.out.println(index);
			}
				
		}
		System.out.println("---------------------------------------------");
	}
	
	void divBy7Or13(int startIndex,int endIndex){
		for(int index=startIndex;index<=endIndex;index++) {	
			if(index%7==0) {
				System.out.println(index+" is divisible by 7");
			}else if(index%13==0) {
				System.out.println(index+" is divisible by 13");
			}
				
		}
		System.out.println("---------------------------------------------");
	}
	
	void sumAll(int startIndex,int endIndex) {
		int sum=0;
		for(int index=startIndex;index<=endIndex;index++) {
			sum=sum+index;
		}
		System.out.println("Sum is "+sum);
		System.out.println("---------------------------------------------");
	}
	
	void diffBetOddAndEven(int startIndex,int endIndex){
		int sum1=0,sum2=0;
		int diff=0;
		for(int index=startIndex;index<=endIndex;index++) {
			if(index %2 !=0) {
				sum1=sum1+index;
			}else if(index %2==0) {
				sum2=sum2+index;
			}
			
			diff=sum1-sum2;
		}
		System.out.println("Difference between Sum of Odd Num and Even Num is "+diff);
		System.out.println("---------------------------------------------");
	
	}
	
	void printOddReverse(int startIndex,int endIndex) {
		System.out.println("Odd num in Reverse Order are ");
		for(int index=endIndex;index>startIndex;index--) {
			if(index%2!=0) {
				System.out.println(index);
			}
		}
		System.out.println("---------------------------------------------");
	}
	
	public static void main(String[] args) {
		Assignment_7 assignment_7= new Assignment_7();
		assignment_7.evenNum(10, 15);
		assignment_7.divBy5(10, 30);
		assignment_7.divBy5And3(5, 18);	
		assignment_7.divBy7Or13(5, 40);	
		assignment_7.sumAll(1, 5);	
		assignment_7.diffBetOddAndEven(3, 9);
		assignment_7.printOddReverse(10, 20);
		}
		
}

package chirag.loopdemo;
//Assignment:- 7

public class Example8 {
	void getNumDivisibleBy5() {
		for(int index=1; index <50;index++) {
			if(index % 5==0)
				System.out.println(index);
		}
	}	
	void getNumDivisibleBy3() {
		for(int index=1;index<15;index++) {
			if(index %3==0)
				System.out.println(index);
		}
	}
	
	void getNumDivisibleBy3And5(int startNUm,int endNum) {
		for(int index=startNUm;index<=endNum;index++) {
			if((index % 3 == 0) && (index % 5 == 0))
			System.out.println(index+" : is divisible by 5 and 3");    				
			if(index % 3 == 0)
			System.out.println(index+" : is divisible by 3");
			if(index % 5 == 0)
			System.out.println(index+ " : is divisible by 5");
			if((index % 3 == 0) && (index % 5 == 0))
			System.out.println(index+" : is divisible by 5 and 3");
	}
}
	void getEvenAndOddNmbers(int startNum,int endNum) {
		for(int index=startNum;index<=endNum;index++) {
			if(index%2==0)
			System.out.println(index+" : is a even number");
			else {
				System.out.println(index+ " : is a odd number"); 
				}	
			}
		}
	void sumOfOddAndEvenNumbers(int startNum,int endNum) {
		int odd=0;
		int even=0;
		for(int index=startNum;index<=endNum;index++) {
			if(index % 2 == 0)
			even=even+index;
			else {
				odd=odd+index;
				}
			}
			int diff=odd-even;
			System.out.println("sum of "+odd+" and "+even+ "is : "+diff);
		}
	
	void reverseOddNumbers(int startNum,int endNum) {
		for(int index=endNum;index>=startNum;index--) {		
		if(index % 2 != 0)
		System.out.println(index);
		}
	}
	
	void getNumDivisibleBy13and7(int startNum,int endNum) {
		for(int index=startNum;index<=endNum;index++) {
			if((index %7==0) ||(index % 13 ==0))
				if(index % 7==0)
			System.out.println(index+" :is divisible by 7");
				else {
					System.out.println(index+" :is divisible by 13");
				}		
		}
	}
	public static void main(String[] args) {
		
		Example8 example8=new Example8();
		example8.getNumDivisibleBy5();
		System.out.println("-------------------------------");
		example8.getNumDivisibleBy3();
		System.out.println("--------------------------------");
		example8.getNumDivisibleBy3And5(1,20);
		System.out.println("--------------------------------");
		example8.getEvenAndOddNmbers(1,14);
		System.out.println("--------------------------------");
		example8.sumOfOddAndEvenNumbers(1,43);
		System.out.println("---------------------------------");
		example8.reverseOddNumbers(10, 20);
		System.out.println("---------------------------------");
		example8.getNumDivisibleBy13and7(5, 40);
	}
}


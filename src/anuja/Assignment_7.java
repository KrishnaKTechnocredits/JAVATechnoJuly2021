package anuja;

public class Assignment_7 {
	int sum=0;
	int sum1=0;
	int sum2=0;

	
	void getEvenNos(int index) {
		for(;index<=15;index++) {
			if(index%2==0) {
				System.out.println(index +" is a even number");
				
			
	     }
		 }
	     }	
	
	void getDivisibleby5(int index) {
		for(;index<=30;index++) {
			if(index%5==0) {
				System.out.println(index +" is divisible by 5");
				
			
	     }
		 }
	     }	
	
	void getDiv3and5(int index) {
		for(;index<=18;index++) {
			if((index%5==0)&& (index%3==0)) {
				System.out.println(index +" is divisible by 3 and 5");
				
			
	     }
		 }
		
	}
	
	void getDiv7or13(int index) {
		for(;index<=40;index++) {
			if((index%7==0)|| (index%13==0)) {
				System.out.println(index +" is divisible by 7 or 13");
				
			
	     }
		 }
		
	}
	
	void getSumNos(int index) {
		for(;index<=5;index++) {
			//int sum=0;
			sum=sum+index;
			
		
	     }
		System.out.println("Sum is "+ sum);
		 }
	
	void getDiffNos(int index) {
		for(;index<=9;index++) {
			if(index%2==0) {
				sum1=sum1+index;
				//System.out.println(sum1);
				
			}
			else {
				sum2=sum2+index;
				
			//System.out.println(sum2);
				
			}
			}
			
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2-sum1);
	     }
	
		void getOddReverse(int index) {
			for(;index>=10;index--) {
				if(index%2!=0) {
					System.out.println(index);
				}
			}
			}
			
			
		
		
	
	
		 
		
	
	
	
		
		
	
	
	public static void main(String[] args) {
		Assignment_7 assignment_7=new Assignment_7();
		assignment_7.getEvenNos(10);
		System.out.println("***********");
		assignment_7.getDivisibleby5(10);
		System.out.println("***********");
		assignment_7.getDiv3and5(5);
		System.out.println("***********");
		assignment_7.getDiv7or13(5);
		System.out.println("***********");
		assignment_7.getSumNos(1);
		System.out.println("***********");
		assignment_7.getDiffNos(3);
		System.out.println("***********");
		assignment_7.getOddReverse(20);
		
	}
	}



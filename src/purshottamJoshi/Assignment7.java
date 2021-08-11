package purshottamJoshi;

class Assignment7{
	
	void evenNumbers(){
		System.out.println("Even Numbers are :");
		for(int index=1;index <=10;index++){
			if(index % 2 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleFive(){
		System.out.println("Divisible by 5 numbers are:");
		for(int index=10;index<=30;index++){
			if(index % 5 ==0){
		System.out.println(index);
			}
		}
	}
	
	void divisibleFiveAndThree(){
		System.out.println("Divisible by 5 & 3 numbers are: ");
		for(int index=5;index<=18;index++){
			if(index%5==0 && index %3 ==0){
				System.out.println(index);
				
			}
			
			
		}
	}
	void divisibleSevenOr13(){
		for (int index=5;index<=40;index++){
			if(index %7==0){
				System.out.println(index +" is divisible by 7 ");
			}else if(index % 13==0){

				System.out.println(index+" is divisible by 13");
			}
		}
	}
	void sumOfNumbers(){
		int sum=0;
		for(int index=1;index<=5;index++){
				sum=sum+index;
		}
		System.out.println("Sum of all numbers " +sum);
	}
	void addOddEvenNo(){
		int oddSum=0;
		int evenSum=0;
		int difference=0;
		for(int index=3;index<=9;index++){
			if(index % 2 !=0){
				oddSum=oddSum+index;
			}else if(index %2 ==0){
				evenSum=evenSum+index;
			}
			
		}
		difference= oddSum -evenSum;
		System.out.println("Difference of odd even sum is:" +difference);
	}
	void oddNumbers(){
		for(int index=20;index<=10;index--){
			if(index %2 !=0){
				System.out.println("Only odd Number :" +index);
			}
		}
	}
	
	
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNumbers();
		assignment7.divisibleFive();
		assignment7.divisibleSevenOr13();
		assignment7.sumOfNumbers();
		assignment7.addOddEvenNo();
	}
	
}


package santosh;
class Assignment7{
    
	void even(int startIndex,int endIndex){
	    System.out.println("********************************");
		System.out.println("Even number is");
	    for(int index=startIndex;index<=endIndex;index++)
	    if(index%2==0) {
	    System.out.println(index);
	    }
        System.out.println("********************************");	
	}
	
	void divisibleby5(int startIndex,int endIndex){
		System.out.println("Number is Divisible by 5");
	    for(int index=startIndex;index<=endIndex;index++)
	    if(index%5==0) {
	    System.out.println(index);
	    }
	    System.out.println("********************************");
	}
	void divby3and5(int startIndex,int endIndex) {
		System.out.println("divisible by 3 and 5");
		for(int index=startIndex;index<=endIndex;index++)
		if(index % 3 == 0 && index % 5 == 0){
		System.out.println(index);
		}
	    System.out.println("********************************");
	}
	
	void divby7or13(int startIndex,int endIndex) {
		System.out.println("Divisible by 7 or 13 numbers are" );
		for(int index=startIndex;index<=endIndex;index++)
		if(index % 7 == 0){
		System.out.println(index+"divisible by 7");
		}
		else if (index % 13 == 0){
		System.out.println(index+"divisible by 13");
		}
        System.out.println("********************************");
	}
	
	void sumofAllnumber(int startIndex, int endIndex){
	    int sum=0;
	    for(int index=startIndex;index<=endIndex;index++) {
		sum = sum + index;
		}
	    System.out.println("Sum is::"+sum);
        System.out.println("***************************");
	}
    
	void diffbetSumofoddeven(int startIndex,int endIndex){
        int sum1=0,sum2=0;
        int difference=0;
	    for(int index=startIndex;index<=endIndex;index++){
		if(index % 2 != 0) {
	    sum1=sum1+index;
	    }
	    else if (index%2==0){
		sum2=sum2+index;
	    }
	    difference=sum1-sum2;
	    }
	    System.out.println("Difference between sum of odd no. and even no."+difference);
        System.out.println("*********************************************************");  
    }

    void oddReverseorder(int startIndex,int endIndex){
	    System.out.println("Reverse number is");
	    for(int index=endIndex;index>startIndex;index--)
	    if(index % 2 != 0) {
	    System.out.println(index +" ");
	    }
	    System.out.println("***********************************************************");
	}

    public static void main(String [] args) {
	    Assignment7 assignment7 = new Assignment7();
	    assignment7.even(10,15);
	    assignment7.divisibleby5(10,30);
	    assignment7.divby3and5(3,18);
	    assignment7.divby7or13(5,40);
	    assignment7.sumofAllnumber(1,5);
	    assignment7.oddReverseorder(10,20);
	    assignment7.diffbetSumofoddeven(3,9);
	    } 
}
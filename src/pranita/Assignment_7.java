package pranita;

public class Assignment_7 {
	
	void printEvenNum(int startIndex,int endIndex){
	    for(int index=startIndex; index<=endIndex ;index=index+2) {
	      System.out.println(index);
		 }
	  
	}
	 void numDivisibleBy(int startIndex,int endIndex) {
		 for(int index=startIndex ; index<=endIndex ;index++) {
			 if(index%5==0 && index<=30) {
	         System.out.println(index);
	     }
	  
	   }  
	 }
	 
	 void divisibleByFiveAndThree(int startIndex,int endIndex) {
		   for(int index=startIndex;index<=endIndex;index++) {
	          if(index%5==0 && index%3==0) {
			  System.out.println("C.No is divisible by 5 & 3");
	          System.out.println(index);
		  }
	   }
	 
	 }
	 
	  void divisibleBySevenOrThirteen(int startIndex,int endIndex) {
		    for(int index=startIndex;index<=endIndex;index++) {
		       if(index%7==0) {
		        System.out.println(index +" is divisible by 7");
		 	   }else if(index%13==0){
		 		System.out.println(index +" is divisible by 13");
	
			  } 		  
		 }
	 
	  }
	  
	     void sumOfNum(int startIndex,int endIndex) {
		    int sum=0;
		      for(int index=startIndex; index<=endIndex;index++) {
			   sum=sum+index;
			    System.out.println(+sum);
		      }
	     }    
       
	     void difference(int startIndex,int endIndex) {
	    	 int diff,sumEven=0,sumOdd=0;
	    	 for(int index=startIndex; index<=endIndex;index++) {
	           if(index%2!=0)
	        	   sumOdd=sumOdd+index;
	           else
	        	   sumEven=sumEven+index;
	    	 }
	    	   diff=sumOdd-sumEven;
	    	   System.out.println(+diff);
	    	 
	    	 
	     }
		  
	  
	  void reverseOddNum() {
		  for(int index=20;index>=10;index--) {
			  if(index%2!=0) {
				  System.out.println(index);
			  }
		  }
	  }
	  
	  public static void main(String[] args) {
		// TODO Auto-generated method stu
       Assignment_7 assignment_7=new Assignment_7();
       System.out.println("A.Even numbers are :");
       assignment_7.printEvenNum(10,15);
       System.out.println("B.Number divisible by 5");
       assignment_7.numDivisibleBy(5,30);
       assignment_7.divisibleByFiveAndThree(5,18);
       System.out.println("D.No is divisible by 7 or 13");
       assignment_7.divisibleBySevenOrThirteen(5,40);
       System.out.println("E.Sum is");
       assignment_7.sumOfNum(1,5);
       System.out.println("F.Difference is");
       assignment_7.difference(3,9);
       System.out.println("G.Odd numbers in reverse order");
       assignment_7.reverseOddNum();
        
       
	}

}

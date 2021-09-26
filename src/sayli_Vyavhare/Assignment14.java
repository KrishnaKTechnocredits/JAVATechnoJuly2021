package sayli_Vyavhare;

public class Assignment14 {
	
	int [] input= {1,11,44,23,55,99,23};
	int maxNumber,diffMaxAndMin ,minNumber=input[0];
	
	void getMaxFromGivenArray() {
		
		 for(int index=0;index<input.length;index++){
			 if(maxNumber<input[index]) {
				 maxNumber=input[index];
			 }
		 }
		 System.out.println("Maximum number from given array is "+maxNumber);	
	}
	
	void getMinFromGivenArray() {
		 for(int index=0;index<input.length;index++){
			 if(minNumber>input[index]) {
				 minNumber=input[index];
			 }
		 }
		 System.out.println("Minimum number from given array is "+minNumber);	
	}
	
	void getDifferenceOfMaxAndMin() {
		diffMaxAndMin= maxNumber-minNumber;
		 System.out.println("Difference between maximum number and minimim number is " + diffMaxAndMin);	

	}
	
	void getDifferenceOfMaxOddAndMaxEven(int arr[]) {
		int maxNumber1=0,maxEvenNumber=0,maxOddNumber=0,differenceEvenOdd=0;
		
		for(int index=0;index<arr.length;index++){
				 if(maxNumber1<arr[index]) {
				    maxNumber1=arr[index];
				      if(maxNumber1% 2 ==0)
				 		  maxEvenNumber=maxNumber1;
				 	  if(maxNumber1% 2 !=0)
				 		  maxOddNumber=maxNumber1;
	 	}
	 }
		 if(maxEvenNumber > maxOddNumber) {
			 differenceEvenOdd= maxEvenNumber-maxOddNumber;
		     System.out.println("Difference between "+ maxEvenNumber + " and " + maxOddNumber + " is: " + differenceEvenOdd );
		  }
		 if(maxEvenNumber < maxOddNumber) {
			 differenceEvenOdd= maxOddNumber-maxEvenNumber;	
		     System.out.println("Difference between "+ maxOddNumber + " and " + maxEvenNumber + " is: " + differenceEvenOdd );
	   }
	}
	
	public static void main(String[] args) {
		int arr[]= {1,11,44,23,55,99,23,22};
		
		Assignment14 assignment14= new Assignment14();
		assignment14.getMaxFromGivenArray();
		assignment14.getMinFromGivenArray();
		assignment14.getDifferenceOfMaxAndMin();
		assignment14.getDifferenceOfMaxOddAndMaxEven(arr);
         
	}
}

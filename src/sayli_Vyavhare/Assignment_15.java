package sayli_Vyavhare;

public class Assignment_15 {

	void getDifferenceOfEvenLengthAndOddLength() {
		String[] arr= {"Maulik","Techno","Nidhi","Ankit"};
		int evenLength=0;
		int oddLength = 0;
	  
		for(int index=0;index<arr.length;index++) {
			
			if(arr[index].length() %2==0)
				evenLength += arr[index].length();
		    
			else
				oddLength += arr[index].length();
		}	
		System.out.println("Difference of Even length name and odd length name is: "+ (evenLength-oddLength));	
	}
	
	void getMiddleCharOfString() {
		String []arr= {"hello","techno","credits"};
		char[] charArray=new char[arr.length];
		int middleChar = 0;
		for(int index=0;index<arr.length;index++) {
			
			if(arr[index].length() % 2==0) 
				middleChar= arr[index].length()/2-1;
			
			else 
				middleChar=arr[index].length()/2;
		
		charArray[index]=arr[index].charAt(middleChar);
		System.out.println("Middle character of "+arr[index] + " is " + charArray[index]);
		}				
	}
	

	void getSumOfEvenAndOddNumbers(int arr[]) {
      int evenNumber=0;
      int  oddNumber=0;
      int differenceEvenOdd=0;
		
		for(int index=0;index<arr.length;index++) {
				 if(arr[index]% 2 ==0)
				    evenNumber +=arr[index];
				 else
				    oddNumber +=arr[index];
	 	}
	 
		 if(evenNumber > oddNumber) {
			 differenceEvenOdd = evenNumber-oddNumber;
		     System.out.println("Difference between "+ evenNumber + " and " + oddNumber + " is: " + differenceEvenOdd );
		  }
		 if(evenNumber < oddNumber) {
			 differenceEvenOdd= oddNumber-evenNumber;	
		     System.out.println("Difference between "+ oddNumber + " and " + evenNumber + " is: " + differenceEvenOdd );
	   }
	}
	
	public static void main(String args[]) {
		int []arr= {12,2,13,9};
		int []arr1= {13,22,10,3};
		
		Assignment_15 assignment_15=new Assignment_15();
		System.out.println("------------------Program1-----------------");
		assignment_15.getDifferenceOfEvenLengthAndOddLength();
		System.out.println("------------------Program2-----------------");
		assignment_15.getSumOfEvenAndOddNumbers(arr);
		assignment_15.getSumOfEvenAndOddNumbers(arr1);
		System.out.println("------------------Program3-----------------");
		assignment_15.getMiddleCharOfString();
	}
}

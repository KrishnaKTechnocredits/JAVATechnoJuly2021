package dattaraj;

public class Assignment30_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30_P1 assign_p1 = new Assignment30_P1();
		assign_p1.displayResult(123);
	}

	 boolean isNumPalindrome(int i) {
		 int r,sum=0,temp;    
		  
		temp=i;    
		 while(i>0){    
		   r=i%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   i=i/10;    
		 }    
		 if(temp==sum) {
			 return true;    
		 }else {  
			 return false;	
		 }
	}
	 
	 void displayResult(int num) {
		 if(isNumPalindrome(num)) {
			 System.out.println("Number "+ num + " is Palindrome Number.");
		 }else {
			 System.out.println("Number "+ num + " is Not a Palindrome Number.");
		 }
	 
	 }

}

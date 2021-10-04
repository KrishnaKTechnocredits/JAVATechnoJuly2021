package akanksha_K_new;

public class Assignment30 {
	
	int getReverse(int num) {
		int reverse=0;
		while(num!=0) {
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
		}  
			System.out.println("The reverse of the given number is: " + reverse);
			return reverse;
	}
	
	int getArmstrongNum(int num) {
		int armstrong=0;
		int sum =0;	
		while(num!=0) {
			int lastindex = num % 10;
			armstrong = (lastindex * lastindex * lastindex) + armstrong;
			sum = sum *10 +lastindex;
			num = num/10;
		}
		return armstrong;
	}
	
	boolean verifyIfArmstrong(int num) {
		boolean flag = true;
		if(getArmstrongNum(num)==num) {
			flag = true;
		    System.out.println("The number is armstrong: " + num);
		}
		else {
			flag= false;
		    System.out.println("The number is not an armstrong: " + num);
		}
		
			return flag;
	}	
	
	int getpalindrome(int num) {
		 int remainder;
		 int sum = 0;
		  int temp;    
		  
		  temp =  num;
		  while(num > 0) {
			  remainder = num % 10;   
			   sum = (sum * 10) + remainder;    
			   num = num / 10;  
		  }
		  if(temp==sum)    
			   System.out.println("Given number is palindrome  ");    
			  else    
			   System.out.println("Given number is not palindrome");    

		return num;
	}
	
	public static void main(String args[]) {
		Assignment30 assi = new Assignment30();
		assi.getReverse(1234);
		assi.verifyIfArmstrong(153);
		assi.getpalindrome(12321);	
	}
}

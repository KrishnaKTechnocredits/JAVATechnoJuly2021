package pritiProgrammesOnNumbers;

public class Assingment_30_3 {
	
	
	boolean isPallindrome(int number) {
		int sum=0;
		int num=number;
		int remainder=0;
		while(num>0) {
			remainder =num%10;
			sum = sum*10+ remainder;
			num=num/10;
			
		}
		if (number==sum) 
			return true;
		else
			return false;
	}
		
		
	void  displayResult(int number) {
		if (isPallindrome(number)) 
			System.out.println(number +":Number is Pallindrome");
		else
			System.out.println(number +":Number is not Pallindrome");
	}
		
	public static void main(String[] a) {
		Assingment_30_3 assingment_30_3 = new Assingment_30_3();
		int num= 12321;
		assingment_30_3.displayResult(num);
		int num1= 12322;
		assingment_30_3.displayResult(num1);
		
	}
	

}
/*Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.*/





package pritiProgrammesOnNumbers;

public class Assingment_30_4 {
		
	
	boolean isPerfectNum(int num) {
		int number= num;
		int sum=0;
		for (int index=1; index<num;index++) {
			if (number%index==0) {
				sum= sum+index;
			}
			
		}
		if (num==sum) 
			return true;
		else
			return false;
	}
		
	void displayResult(int num) {
		if (isPerfectNum(num)) {
			System.out.println(num+":Number is Perfect Number");
		}else {
			System.out.println(num+":Number is not Perfect Number");
		}
	}
	
	
	public static void main(String[] a) {
		Assingment_30_4 asssingment_30_4= new Assingment_30_4();
		int num= 6;
		asssingment_30_4.displayResult(num);
		int num1= 15;
		asssingment_30_4.displayResult(num1);
		
	}

}
/*(Optional) Program 4 : verify given number is a perfect number or not.
A number is a perfect number if is equal to sum of its proper divisors, that is, sum of its positive divisors excluding the number itself. Write a function to check if a given number is perfect or not. 
Examples: 
Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of 
divisors is 9 which is not equal to 15.
Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of 
divisors is 6.)*/
 


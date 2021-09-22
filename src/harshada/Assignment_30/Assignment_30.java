/* Program 1: Write a method to reverse a given number.
input : 1932
output : 2391
 
Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
 
Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 
Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number
 
input : 123
output : 123 is not an Palindrome number.
 
(Optional) Program 4 : verify given number is a perfect number or not.
 
(Optional) Program 5 : verify given number is a perfect square.
 
*/
package harshada.Assignment_30;

public class Assignment_30 {

	
	void p1_reverseNumber(int num) {
		int originalNum=num;
		int reverseNum=0;
		while(num > 0) {
			reverseNum=reverseNum*10 + num % 10;
			num=num/10;
		}
		System.out.println("Reverse of "+ originalNum + " is "+ reverseNum);
	}
	
	void p2_verify_ArmstrongNumber(int num) {
		//Armstrong number: sum of the cube of its digits is equal to number itself 371=27+343+1
		int num1=num;
		int sum=0;
		int remainder=0;
		while(num>0) {
			remainder=num%10;
			sum=sum+(remainder*remainder*remainder);
			num=num/10;
		}
		if(num1==sum)
			System.out.println("Number " +num1+ " is Armstrong number ");
		else
			System.out.println("Number " +num1+ " is not a Armstrong number");
	}
	void p3_verifyPalindromeNumber(int number) {
		int num=number;
		int rev=0;
		while(number>0) {
			rev= rev*10 + number % 10;
			number=number/10;
		}
		if(num==rev)
			System.out.println("Number " + rev+ " is Palindrome number ");
		else
			System.out.println("Number " +rev + " is not a Palindrome number");		
	}
	
	void p4_verifyPerfectNumber(int num) {// perfect number example 6--> 1+2+3=6 (addition of divisors is equal to the number)
		int sum=0;
		for(int index=1; index <= num/2; index++) {
			if(num%index==0) {
			sum=sum+index;
			}
		}
		if(sum==num)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+ " is not a perfect number ");
	}
	
	void p5_verifyPerfectSquare(int num) {// perfect square ex. 2,4,16,25,36
		int sqrt=0;
		int ans=0;
		sqrt=(int) Math.sqrt(num);
		ans=sqrt*sqrt;
		if(ans==num) 
			System.out.println(num+ " is perfect square ");
			else
				System.out.println(num+ " is not a perfect square ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_30 p1=new Assignment_30();
		System.out.println("\nProgram 1 Output : ");
		p1.p1_reverseNumber(1234);
		p1.p1_reverseNumber(9113);
		System.out.println("\nProgram 2 Output : ");
		p1.p2_verify_ArmstrongNumber(371);
		p1.p2_verify_ArmstrongNumber(432);
		System.out.println("\nProgram 3 Output : ");
		p1.p3_verifyPalindromeNumber(121321);
		p1.p3_verifyPalindromeNumber(13131);
		System.out.println("\nProgram 4 Output : ");
		p1.p4_verifyPerfectNumber(6);
		p1.p4_verifyPerfectNumber(28);
		System.out.println("\nProgram 5 Output : ");
		p1.p5_verifyPerfectSquare(16);
		p1.p5_verifyPerfectSquare(36);
		p1.p5_verifyPerfectSquare(10);
	
	}

}

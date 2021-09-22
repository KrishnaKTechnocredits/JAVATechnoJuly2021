/*
Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
 */
package atul_K.Assignments.Ass30;

public class Program2 {
	int getNumOfDigit(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num= num/10;
		}
		return count;
	}
	
	boolean isArmstrong(int num) {
		int oNum = num;
		double n = getNumOfDigit(num);
		double sum = 0;
		while(num > 0) {
		 double r= num%10;
		 sum += Math.pow(r, n);
		 num = num/10;
		}
		if (sum == oNum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num = 371;
		Program2 p2 = new Program2();
		if (p2.isArmstrong(num))
			System.out.println("num is Armstrong");
		else
			System.out.println("num is not Armstrong");
	}
	
}

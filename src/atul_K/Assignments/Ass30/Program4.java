/*
 Program 4 : verify given number is a perfect number or not.
 */
package atul_K.Assignments.Ass30;

public class Program4 {
	boolean isPerfect(int num) {
		int sum = 1;
		for (int index=2;index <= num/2;index++) {
			if(num%index ==0)
				sum += index;
		}
		if (num == sum)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		int num= 74;
		Program4 p4 = new Program4();
		if (p4.isPerfect(num))
			System.out.println(num + " is perfect number");
		else 
			System.out.println(num + " is not perfect number");
	}
}

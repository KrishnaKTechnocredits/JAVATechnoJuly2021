/* Assignment 11 : 13th Aug'2021  Program 1 
 Write a method to find out required numbers to generate sum more than 100
 */

package arti_K;

public class sumWhileLoop {
	
	void countNum(int range) {
		int num=1;
		int sum=0; 
		int count=0;
		
		while(sum < range) {
			sum = sum + num;
			num++;
			count++;
		}
		System.out.println("Numbers required to generate sum more than 100 is : "+count);
	}
	public static void main(String[] args) {
		sumWhileLoop sum = new sumWhileLoop();
		sum.countNum(100);
	}
}

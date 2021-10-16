
/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package shreya_assignment_46_Collections_program;

import java.util.ArrayList;

public class Program7 {
	void getPrimeNumber(int startRange,int endRange) {
		int count=1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int index=startRange;index<endRange;index++) {
			if(isPrime(index)&&count<=10) {
				list.add(index);
			    count++;
			}
		}
		System.out.println("First 10 prime numbers from the given list is :"+list);
	}
	
	boolean isPrime(int num) {
		for(int index=2;index<num/2;index++) {
			if(num%index==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Program7 program7 = new Program7();
		program7.getPrimeNumber(100, 500);
	}

}

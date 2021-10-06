/*
 * Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program7 {
	
	
	void getPrimeNum(int startRange, int endRange) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int index = startRange; index <= endRange; index++)
			if(isPrimeNum(index))
				list.add(index);
		
		System.out.println("The list of prime numbers between 100 and 500 is \n" + list);
	}
	
	boolean isPrimeNum(int num) {
		
		for(int index = 2; index < num; index++) {
			if(num%index==0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 obj = new Program7();
		obj.getPrimeNum(100, 500);
		
	}

}

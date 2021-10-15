/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package purshottamJoshi;

import java.util.ArrayList;

public class Assignment46_7 {
	ArrayList al = new ArrayList<>();
	
	void checkPrimeNumber(int number) {
		//Integer a=10;
		boolean status = true;
			for(int index=2; index < number; index++) {
				if(number % index == 0) {
					status = false;
					break;
				}
			} 
			if(status) {
				if(al.size() < 10)
					al.add(number);
			}
	}	
	
	void getPrimeNumber(int startIndex,int endIndex) {
		
		for(int index=startIndex; index < endIndex; index++) {
			checkPrimeNumber(index);
		}
		System.out.println(al);
	}
		
	public static void main(String[] args) {
		new Assignment46_7().getPrimeNumber(100, 500);
		
	}
}

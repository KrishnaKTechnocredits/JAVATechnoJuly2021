/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/
package purshottamJoshi;
import java.util.ArrayList;
import java.util.*;
public class Assignment46_12 {
	Set set = new LinkedHashSet();
	void checkPrimeNumber(Integer number) {
		//Integer a=10;
		boolean status = true;
			for(int index=2; index < number; index++) {
				if(number % index == 0) {
					status = false;
					break;
				}
			} 
			if(!status) {
				set.remove(number);
				//if(al.size() < 10)
					//al.add(number);
			}
	}	
	void removeNonPrime(Integer[] input) {
		ArrayList al = new ArrayList<>(Arrays.asList(input));
		for(int index=0; index < al.size(); index++) {
			Integer number = (Integer) al.get(index);
			set.add(number);
			checkPrimeNumber( number);
			//System.out.println(number);
			//if(number % 2 !=0){
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		Integer[] input = {19,12,18,17,23,22};
		new Assignment46_12().removeNonPrime(input);
	}
}

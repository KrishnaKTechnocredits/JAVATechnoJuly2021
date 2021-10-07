package swati.Assignment46;

/*Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]
*/
import java.util.*;
public class Example13 {

	boolean isPrime(int num) {
		boolean flag=true;
		
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
			else
				flag=true;								
		}
		return flag;
	}
	
	void removeNonPrimeNum(Integer[] input) {
		Set<Integer> list1=new LinkedHashSet<Integer>(Arrays.asList(input));
		Set<Integer> output=new LinkedHashSet<Integer>();
		for(int num :list1) {
			if(isPrime(num)) {
				output.add(num);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] a) {
		Example13 e1=new Example13();
		Integer[] input= {19,12,18,17,23,22};
		e1.removeNonPrimeNum(input);
		
	}
}
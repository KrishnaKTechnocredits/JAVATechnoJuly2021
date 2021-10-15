package swati.Assignment46;

/*
 * Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].
 */
import java.util.*;

public class Example7 {

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
	
	void returnFirst10PrimeNo(int start,int end,int range) {
		List<Integer> list1=new ArrayList<Integer>();
		int count=0;
		for(int index=start;index<end;index++) {
			if(count<range) {
				if(isPrime(index)) {
					list1.add(index);
					count++;
				}
			}
		}
			
		System.out.println(list1);
	}
	
	public static void main(String[] a) {
		Example7 e1=new Example7();
		e1.returnFirst10PrimeNo(100,500,10);
		
	}
}

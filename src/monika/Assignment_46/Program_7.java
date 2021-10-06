/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package monika.Assignment_46;
import java.util.ArrayList;

public class Program_7 {

	boolean isPrimeNumber(int num) {
		boolean flag=true;
		for(int index=2; index<num; index++) {
			if(num%index==0) {
				
				flag= false;
				break;
			}else
				flag=true;
		}
		return flag;
	}
	
	void getPrimeNumber(int startRange, int endRange) {
		ArrayList<Integer> al=new ArrayList<>();
		int count=0;
		boolean flag=true;
		for(int index=startRange; index<=endRange; index++)
			if(count<10) {
				flag=isPrimeNumber(index);
				if(flag) {
					al.add(index);
					count++;
				}
			}
		System.out.println("Below First 10 Prime Numbers are Between 100 to 500 is\n"+al);
	}
	public static void main(String[] args) {
		Program_7 program_7=new Program_7();
		program_7.getPrimeNumber(100, 500);
	}
}
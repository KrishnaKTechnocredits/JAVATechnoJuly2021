package gauravk.Assignment_46;

import java.util.ArrayList;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].

 */
public class ReturnListOfPrimeNum {
	
	ArrayList<Integer> listOfPrimeNum(int startRange, int finishRange){
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(int i=startRange, k=0; i<=finishRange; i++) {
			if(isPrime(i)) {
				arl.add(i);
				k++;
				if(k==10)
					break;
			}
		}
		return arl;
	}
	
	boolean isPrime(int num) {
		int j=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				j++;
				break;
			}
		}
		if(j==0)
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.println("The first 10 prime numbers from the range.");
		System.out.println("List of first 10 prime numbers from range [100,500] are : "+new ReturnListOfPrimeNum().listOfPrimeNum(100,500));
	}
}

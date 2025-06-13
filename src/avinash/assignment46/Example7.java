package avinash.assignment46;

import java.util.ArrayList;

/*Return ArrayList of first 10 prime numbers in the range [100,500]*/
public class Example7 {
	
	private static boolean isPrimenumber(int num) {
		boolean prime = true;
		for(int index = 2; index< num/2 ; index++) {
			if(num % index == 0) {
				prime = false;
				break;
			}else {
				prime = true;
			}
		}
		return prime;
	}

	
	static ArrayList<Integer> printFirstTenPrimeNumbers(int startRange, int endRange){
		int count = 1;
		ArrayList<Integer> list = new ArrayList();
		for (int index = startRange; index <= endRange; index++) {
			if (isPrimenumber(index) && count <= 10) {
				list.add(index);
				count++;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printFirstTenPrimeNumbers(100, 200));

	}

}

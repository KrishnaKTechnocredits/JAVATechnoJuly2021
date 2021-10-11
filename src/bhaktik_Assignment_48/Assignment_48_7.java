/*program 7 : find the freq of each number in given array.*/
package bhaktik_Assignment_48;

import java.util.HashMap;

public class Assignment_48_7 {
	
	static void getfrequencyOfNum(Integer [] input) {
		
		HashMap<Integer, Integer> numbers= new HashMap();
		for (int n: input) {
			if (numbers.containsKey(n)) {
				int count= numbers.get(n);
				numbers.put(n, ++count);
			}else 
				numbers.put(n, 1);
			
		}
		System.out.println(numbers);
	}
	public static void main(String[] args) {
		Integer [] input= {1,20,3,1,45,20,1,40};
		getfrequencyOfNum(input);
	}

}

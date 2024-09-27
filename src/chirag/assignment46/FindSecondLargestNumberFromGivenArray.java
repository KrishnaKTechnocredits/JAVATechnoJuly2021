package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

public class FindSecondLargestNumberFromGivenArray {
	
	void getSecondLargestNumber(Integer [] input) {
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(input));
		ArrayList<Integer> al = new ArrayList<>(ts);
		int secondLargestNum = al.get(al.size()-2);
		System.out.println(secondLargestNum);
	}
	public static void main(String[] args) {
		FindSecondLargestNumberFromGivenArray findSecondLargestNumberFromGivenArray=new FindSecondLargestNumberFromGivenArray();
		Integer [] input= {2,3,55,44,64,777,76,1001,44,87,77,101,98};
		findSecondLargestNumberFromGivenArray.getSecondLargestNumber(input);
		
		
	}

}

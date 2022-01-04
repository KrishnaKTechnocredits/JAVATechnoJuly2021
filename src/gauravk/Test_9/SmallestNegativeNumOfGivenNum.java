package gauravk.Test_9;
/*
 * Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

 */
import java.util.TreeSet;

public class SmallestNegativeNumOfGivenNum {
	
	void smallestNegativeNumOfNumber(int x, int[] arr) {
		TreeSet<Integer> negList = new TreeSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0)
				negList.add(arr[i]);
		}
		
		int a = negList.size();
		
		System.out.println("Nearest negative number of any positive number will be the biggest number amongst collections of all negative numbers.\nOutput is: "+negList.last());
		
	}
	
	public static void main(String[] args) {
		int[] arr = {-3,11,123,-11,-9,-55,33,44};
		SmallestNegativeNumOfGivenNum negNum = new SmallestNegativeNumOfGivenNum();
		negNum.smallestNegativeNumOfNumber(8, arr);
	}
}

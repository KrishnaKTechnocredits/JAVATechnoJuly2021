/*program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98
*/

package harshada;

public class MinMaxDifferenceFromArray {
	
	static int max;
	static int min;
	
	int getMaximumNumFromArray() {
		int[] input = {1,11,44,23,55,99,23};
		max=input[0];
		for(int index=1; index < input.length; index++) {
			if(input[index]> max)
				max=input[index];
		}
		return max;
		}
	
	int getMinimumNumFromArray() {
		int[] input = {1,11,44,23,55,99,23};
		min=input[0];
		for(int index=1; index < input.length; index++) {
			if(input[index]< min)
				min=input[index];
		}
		return min;
		}
	
	void getDifferenceOfMaxAndMinNumber() {
		
	int diff=max-min;
	System.out.println("Difference of Maximum and Minimum number of Array is= "+ diff);
		
		
	}
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MinMaxDifferenceFromArray minMaxDifferenceFromArray=new MinMaxDifferenceFromArray();
		int tempMax=minMaxDifferenceFromArray.getMaximumNumFromArray();
		//System.out.println("Maximum Number of given Array is= " + tempMax);
		
		int tempMin=minMaxDifferenceFromArray.getMinimumNumFromArray();
		//System.out.println("Mimimum Number of given Array is= " + tempMin);
		minMaxDifferenceFromArray.getDifferenceOfMaxAndMinNumber();
		
	}

}

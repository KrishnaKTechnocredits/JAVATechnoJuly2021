/*program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11
*/

package harshada;

public class MinimumNumberFromArray {
	int getMinimumNumFromArray() {
		int[] input = {1,11,44,23,55,99,23};
		int min=input[0];
		for(int index=1; index < input.length; index++) {
			if(input[index]< min)
				min=input[index];
		}
		return min;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MinimumNumberFromArray MinimumNumberFromArray=new MinimumNumberFromArray();
			int tempMin=MinimumNumberFromArray.getMinimumNumFromArray();
			System.out.println("Mimimum Number of given Array is= " + tempMin);
		}

}

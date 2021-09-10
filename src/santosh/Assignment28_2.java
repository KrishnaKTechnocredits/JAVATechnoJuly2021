/*Assignment - 28 : 4th Sep'2021 
		Program 2: Find nth highest number from array.
		int[] arr = {10,23,2,11,55,43,99};
		input n = 3;
		output : 43*/
package santosh;
public class Assignment28_2 {
	int[] getHighestNumber(int[] arr) {
		int highest = arr[0];
		int highestIndex = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > highest) {
				highest = arr[index];
				highestIndex = index;
			}

		}
		arr[highestIndex] = 0;
		return arr;
	}
	void displayHighestNumber(int[] arr, int order) {	
		int[] newArr = arr;
		int highest = newArr[0];
		while(order > 1){
			newArr = getHighestNumber(arr);
			order--;
		}
		for(int index = 0; index < newArr.length; index++) {
			if(newArr[index] > highest)
				highest = newArr[index];
		}
		System.out.println("N'th highest number from array: "+highest);
	}
	public static void main(String[] args) {
		Assignment28_2 assignment28_2 = new Assignment28_2();
		int[] arr = {10,23,2,11,55,43,99};
		assignment28_2.displayHighestNumber(arr,3);
	}
}
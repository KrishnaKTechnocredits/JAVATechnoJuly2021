/*Assignment 14 15th Aug'2021
program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98*/


package ritabrata;

public class DiffBtenMaxMin {
	void sub(int[] input1, int[] input2) {
		int difference;
		MaxNumber max= new MaxNumber();
		FindMinimun min= new FindMinimun();
		difference = max.findMAxNumber(input1)- min.findMin(input2);
		System.out.println("The difference between the max and min is: "+ difference);
	}
	
	public static void main(String[] args) {
		DiffBtenMaxMin difference= new DiffBtenMaxMin();
		int[] arr=  {1,11,44,23,55,99,23};
		difference.sub(arr, arr);
	}
}

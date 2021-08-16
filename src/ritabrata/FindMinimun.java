/*
  Assignment:14 15th Aug'2021
 program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11*/


package ritabrata;

public class FindMinimun {
	int findMin(int[] input) {
		int number=0;
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input.length;j++) {
				if(input[j]<input[i]) {
					number=input[j];
					j++;
				}
			}
		}
		System.out.println("The minimum among the numbers is: "+number);
		return number;
	}
	

	public static void main(String[] args) {
		FindMinimun min= new FindMinimun();
		int[] arr= {1,11,44,23,55,99,23};
		min.findMin(arr);

	}

}

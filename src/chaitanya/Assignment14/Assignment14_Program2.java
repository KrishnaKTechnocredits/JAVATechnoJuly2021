//program 1 : find maximum number from given array.

//int[] input = {1,11,44,23,55,99,23};
//output : 99

//program 2 : find minimum number from given array.
//int[] input = {1,11,44,23,55,99,23};
//output : 11


//program 3 : print difference between max and min number from given array.
//int[] input = {1,11,44,23,55,99,23};
//output : 98


//program 4 : print difference between max odd number and max even number from given array. difference should be positive

//int[] input = {1,11,44,23,55,99,23,22};
//hint : 99 - 44
//output : 55

package chaitanya.Assignment14;

public class Assignment14_Program2 {
	
	void displayMinNumber(int[] inputarr) {
		int min = inputarr[0] ;
	  for (int i = 0 ; i < inputarr.length ; i ++) {
		  if(min > inputarr[i])
			  min = inputarr[i] ;
	  }
	  	System.out.println("Least Number in the given array : " + min);
		
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] inputarr = {1,11,44,23,55,99,23};
	Assignment14_Program2 assignment14_Program2 = new Assignment14_Program2();
	assignment14_Program2.displayMinNumber(inputarr);

	}

}
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

public class Assignment14_Program4 {
	
	int maxOddNum(int[] inputarr) {
		int maxoddnum = inputarr[0];
		for (int i = 0 ; i < inputarr.length ; i++) {
			if(maxoddnum < inputarr[i] && inputarr[i]%2 != 0)
				maxoddnum = inputarr[i];
		}
		return maxoddnum ;
		
	}

	
	int maxEvenNum(int[] inputarr) {
		int maxevennum = inputarr[0];
		for (int i = 0 ; i < inputarr.length ; i++) {
			if(maxevennum < inputarr[i] && inputarr[i]%2 == 0)
				maxevennum = inputarr[i];
		}
		return maxevennum ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inputarr = {1,11,44,23,55,99,23};
		Assignment14_Program4 assignment14_Program4 = new Assignment14_Program4();
		if(assignment14_Program4.maxOddNum(inputarr) > assignment14_Program4.maxEvenNum(inputarr))
			System.out.println("Difference between MaxOddNumber & MaxEvenNumber : " + 
		(assignment14_Program4.maxOddNum(inputarr) - assignment14_Program4.maxEvenNum(inputarr)));
		else
			System.out.println("Difference between MaxEvenNumber & MaxOddNumber : " + 
					(assignment14_Program4.maxEvenNum(inputarr) - assignment14_Program4.maxOddNum(inputarr)));
			
	}

}

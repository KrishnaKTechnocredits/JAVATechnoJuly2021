//Assignment 15 : 16th Aug'2021


//*program 1*:  wap that will return difference of even length name and odd lenght name.
//arr[0] = "Maulik";
		
//arr[1] = "Techno";
		
//arr[2] = "Nidhi";
		
//arr[3] = "Ankit";

//output : 2



//program 2 : return middle char of all elements of the String array.
//String[] str = {"hello","techno","credits"};
//char charAt(int index){
//}

//Hint : charAt method of String class helps to retrieve character on given index


//program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

//int[] arr = {12,2,13,9}

//hint : 22 - 14 = 8

//output : 8

//int[] arr = {13,22,10,3}
//hint : 32 - 16 = 16
//output : 16



package chaitanya.Assignment15;

public class Assignment15_Program3 {
	
	int diffEvenSumandOddSum(int[] inputarr) {
		int sumeven = 0, sumodd = 0;
		for(int i = 0 ; i <inputarr.length ; i++) {
			if (inputarr[i]%2 == 0)
				sumeven += inputarr[i] ;
			else 
				sumodd += inputarr[i];
		}
		if (sumodd > sumeven)
			return sumodd-sumeven ;
		else
			return sumeven-sumodd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarr1 = {12,2,13,9};
		Assignment15_Program3 assignment15_program3_1 = new Assignment15_Program3();
		System.out.println("Difference between Sum of Even & Sum of Odd in a Array 1 : " 
				+ assignment15_program3_1.diffEvenSumandOddSum(inputarr1) );
		
		int[] inputarr2 = {13,22,10,3};
		Assignment15_Program3 assignment15_program3_2 = new Assignment15_Program3();
		System.out.println("Difference between Sum of Even & Sum of Odd in a Array 2 : " 
				+ assignment15_program3_2.diffEvenSumandOddSum(inputarr2) );
		
	}

}

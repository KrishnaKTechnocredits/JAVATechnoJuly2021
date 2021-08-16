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

public class Assignment15_Program1 {
	
	int diffEvenLengthandOddLength(String[] inputarr) {
		int sumeven = 0, sumodd = 0;
		for(int i = 0 ; i <inputarr.length ; i++) {
			if (inputarr[i].length()%2 == 0)
				sumeven += inputarr[i].length() ;
			else 
				sumodd += inputarr[i].length();
		}
		return (sumeven-sumodd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputarr = {"Maulik", "Techno", "Nidhi", "Ankit"};
		Assignment15_Program1 assignment15_Program1 = new Assignment15_Program1();
		System.out.println("Difference between Even Length & Odd Lenght of a Array : " 
		+ assignment15_Program1.diffEvenLengthandOddLength(inputarr) );
	}

}

//Assignment 14 : 15th Aug'2021
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

package bhakti;

public class Assignment_14 {
	
	private static String getDifferenceBewMinMax;

	//program 1 : find maximum number from given array.
	int getmaxNumberFromArray(int[] array) {
		int max=0;
		for(int index=0; index< array.length; index++  ) {
			if (array[index]>max)
				max=array[index];
		}
		return max; 
	}
	
	//program 2 : find minimum number from given array.
	int getminNumberFromArray(int[] array) {
		int min=array[0];
		for(int index=0; index< array.length; index++  ) {
			if (array[index]<min)
				min=array[index];
		}
		return min; 
	}
	//program 3 : print difference between max and min number from given array.
	
	int getDifferenceBewMinMax(int[] input) {
		
		int min= getminNumberFromArray(input);
		int max = getmaxNumberFromArray(input);
		int diffrence;
		if (min>max)
			diffrence=min-max;
		else 
			diffrence=max-min;
		return diffrence;
	}
	
	//program 4 : print difference between max odd number and max even number from given array. difference should be positive
	int getDiffMaxMinOddnumber(int[] input) {
		int sumofeven=0;
		int sumofodd=0;
		int difference=0;
		for (int index=0; index< input.length; index++) {
			if (input[index]%2==0)
				sumofeven+=sumofeven;
			else
				sumofodd+=sumofodd;
		}	
			if (sumofeven>sumofodd)
				difference=sumofeven-sumofodd;
			else
				difference=sumofodd-sumofeven;
	return difference;	
				
	}
	
	public static void main(String[] xys) {
		int[] input = {1,2,5,10};
		Assignment_14 assignment_14= new Assignment_14();
			
		System.out.println("Maximum number from porvided array is: "+assignment_14.getmaxNumberFromArray(input));
		System.out.println("Minium number from porvided array is: "+assignment_14.getminNumberFromArray(input));
		System.out.println("Difference between Minnium and maximum number of array is : "+assignment_14.getDifferenceBewMinMax(input));
	}	
}

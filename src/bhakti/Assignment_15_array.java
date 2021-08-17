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
//-----------------------------------------------------------------



package bhakti;

import java.util.Arrays;

public class Assignment_15_array {
	//*program 1*:  wap that will return difference of even length name and odd lenght name.
	int getDifference(String[] array) {
		int evenCount=0;
		int oddCount=0;
		int differnce ;
		for (int index=0; index< array.length; index++ ) {
			 if (array[index].length() %2==0) 
				 evenCount= evenCount+array[index].length();			 
			 else 
				 oddCount=oddCount+ array[index].length();
		}
		if (oddCount>evenCount)
			differnce=oddCount-evenCount;
		else
			differnce = evenCount- oddCount;
		return differnce;	
	}
	
	//program 2 : return middle char of all elements of the String array.
	
	char[] getMiddleCharacter(String[] array) {
		char[] middle = new char[array.length];
		for (int index=0; index< array.length ; index++) {
			if (array[index].length() %2 !=0) {
				//int x=array[index].length()/2;
				//System.out.println(array[index].charAt(array[index].length()/2));
				middle[index]=array[index].charAt(array[index].length()/2);
			}else {
				middle[index]=array[index].charAt(array[index].length()/2-1);
				//System.out.println(array[index].charAt(array[index].length()/2-1));
			}
		}
		//potion1  to print out put : System.out.println("Middle characters of provided String: "+Arrays.toString(middle)+" :");
		return middle;
	}
	//program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method
	
	int getDiffernceSumofEven_Odd(int[] num){
		int oddNumberSum=0;
		int evenNumberSum=0;
		int differnce=0; 
		for (int index=0; index< num.length ; index++ ) {
			if (num[index]%2==0) 
				evenNumberSum+=num[index];
			else
				oddNumberSum+=num[index];
		}	
		if (oddNumberSum>evenNumberSum)	
			differnce= oddNumberSum-evenNumberSum;
		else
			differnce=evenNumberSum-oddNumberSum;	
		
		return differnce;
	}
	
	
	public static void main (String[]kj) {
		String[] array1= {"bhat", "bhakti", "Maulic", "test"};
		int[] number= {5,10,20};
		char[] middle1 = new char[array1.length];
		
		Assignment_15_array assignment_15= new Assignment_15_array();
		
		System.out.println("Difference of even length name and odd lenght name: "+assignment_15.getDifference(array1));
		middle1=assignment_15.getMiddleCharacter(array1);	
		System.out.println("Middle char from provide array: " +Arrays.toString(middle1));
		System.out.println("Difference of even number and odd number is: "+assignment_15.getDiffernceSumofEven_Odd(number));
			
	}
}

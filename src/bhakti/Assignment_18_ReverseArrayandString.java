package bhakti;

import java.util.Arrays;

public class Assignment_18_ReverseArrayandString {
	
	String reverseString(String srt) {
		String reverse="";
		
		for (int index=srt.length()-1 ; index>=0 ; index--) {
			reverse= reverse+srt.charAt(index);
		}
		
		return reverse;
	}

	String[] reverseStringarray(String[] array1) {
		for (int index=0; index< array1.length ; index++) {
			array1[index]= reverseString(array1[index]);
		}
		 return array1;
	}
	
	String[] arrayReverse(String[] array1) {
		String[] reversArray= new String[array1.length];
		int x=0;
		for (int index=array1.length-1; index>=0; index--) {
			
			reversArray[x]=array1[index];
			x++;		
		}
		System.out.println("Revered array string with reverese each index:  ");
		return reversArray;
		
	}
	
	public static void main(String[] ghg) {
		String[] array1= {"Bhakti", "Swarnim", "Prasad"};
		Assignment_18_ReverseArrayandString assignment_18_ReverseArrayandString = new Assignment_18_ReverseArrayandString();
		System.out.println("Provided string ");
		System.out.println(Arrays.deepToString(array1));
		assignment_18_ReverseArrayandString.reverseStringarray(array1);
		System.out.println(Arrays.toString(assignment_18_ReverseArrayandString.arrayReverse(array1)));	
	}
}

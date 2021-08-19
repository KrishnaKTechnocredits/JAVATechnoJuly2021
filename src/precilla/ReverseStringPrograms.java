package precilla;

import java.util.Arrays;

public class ReverseStringPrograms {
	String reverseStringArray(String[] array) {
		String[] reverse=new String[array.length];
		for(int index=0;index<array.length;index++) {
			String reverse1="";
			for(int index1=array[index].length()-1;index1>=0;index1--) {
				reverse1=reverse1+array[index].charAt(index1);
				reverse[index]=reverse1;
				}
			}
		return Arrays.toString(reverse);
	}
	String reverseStringArray1(String[] array) {	
		String[] reverse=new String[array.length];
		int indexReverse=0;
		for(int index=array.length-1;index>0;index--)  {
			String reverse1="";
			for(int index1=array[index].length()-1;index1>=0;index1--) {
				reverse1=reverse1+array[index].charAt(index1);
				reverse[indexReverse]=reverse1;
				}
			indexReverse++;
			}
		return Arrays.toString(reverse);
	}
	public static void main(String[] args) {
		ReverseStringPrograms reverseArray=new ReverseStringPrograms();
		String array[]= {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String array1[]= {"Techno","credits","Precilla","Aranha"};
		System.out.println("Program 1 :\nGiven array "+ Arrays.toString(array));
		System.out.println("Reverse elements at same position : "+ reverseArray.reverseStringArray(array));
		System.out.println("\nProgram 2 :\nGiven array "+ Arrays.toString(array1));
		System.out.println("Reverse elements in a reverse order : "+ reverseArray.reverseStringArray1(array1));
	}

}

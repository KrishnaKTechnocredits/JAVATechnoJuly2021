package ramkrishna;

import java.util.Arrays; 

public class WapElement {

	int[] removeSpecificElement(int[]input,int num) {
 		int[] array=new int[input.length-1];
 	//	System.out.println("Before Removing Element = " + Arrays.toString(input));
 		for(int index=0;index<input.length;index++) {
 			if(input[index]==num) {
 				for(int i=index;index<input.length-1;index++) {
 					input[i]=input[i+1];
 				}
 				for(index=0;index<array.length;index++) {
 					array[index]+=input[index];
 				}
 			}
 		} return array;
 	}
 	public static void main(String[] args) {
 		WapElement wapelement =new WapElement();
 		int[] input= {25,14,56,15,36,56,77,18,29,49};
 		
 		int[] array= wapelement.removeSpecificElement(input,14);
 		System.out.println("Array after removing Element "+Arrays.toString(array));
      }
}
package ankita_CodingTest3;

import java.util.Arrays;

public class CodingTest3 {
	
	int[] removeElement(int[]input,int num) {
		int[] array=new int[input.length-1];
		for(int index=0;index<input.length;index++) {
			if(input[index]==num) {
				for(int i=index;index<input.length-1;index++) {
					input[i]=input[i+1];
				}
				for(index=0;index<array.length;index++) {
					array[index]+=input[index];
				}
			}
		}return array;
	}
	public static void main(String[] args) {
		CodingTest3 codingtest3=new CodingTest3();
		int[]input= {25,14,56,15,36,56,77,18,29,49};
		int[] array=codingtest3.removeElement(input,14);
		System.out.println("Array after removing element "+Arrays.toString(array));
		
	}

}

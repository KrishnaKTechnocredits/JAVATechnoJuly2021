package chirag.codingTest;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {
	
	void removeSpecificElement(int [] input,int arr) {
		int [] newInput = new int [input.length-1];
		int countIndex=0;
		for(int index = 0;index< input.length;index ++) {
			if(input[index] != arr) {
				newInput[countIndex] = input[index];
				countIndex++;
			}
		}
		System.out.println(Arrays.toString(newInput));
	}
	public static void main(String[] args) {
		
		RemoveSpecificElementFromArray removeSpecificElementFromArray = new RemoveSpecificElementFromArray();
		int [] input = {25,14,56,15,36,56,77,18,29,49};
		removeSpecificElementFromArray.removeSpecificElement(input, 14);
	}
}
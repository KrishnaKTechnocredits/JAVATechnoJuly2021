// Find difference between the oldest and youngest age group

package suchita;

import java.util.Arrays;

class Assignment21 {

	int getDiffBetweenOldest_Youngest(int arr[]) {
		
		int max = 0;
		int min = arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index] > max)
				max = arr[index];
			
			if(arr[index] < min)
				min = arr[index];
		}
		return max-min;
		
	}
	
	public static void main(String[] args) {
		
		Assignment21 assignment = new Assignment21();
		int[] age = {10,34,38,68,72,95,6};
		int diff = assignment.getDiffBetweenOldest_Youngest(age);
		System.out.println("Difference between the oldest and youngest given age :\n" + Arrays.toString(age)+ " :: " + diff);
	}
}
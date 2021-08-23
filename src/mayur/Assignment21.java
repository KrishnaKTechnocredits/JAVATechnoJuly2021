package mayur;

import java.util.Arrays;

public class Assignment21 {
	
	int findAgeDifference(int arr[]) {
		int max = 0;
		int min = arr[0];
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]>max)
				max=arr[index];
			if(arr[index] < min)
				min = arr[index];

		}

		return max - min;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment21 assignment21 = new Assignment21();
		int age[] = {10,34,38,68,72,95,6};
		int difference = assignment21.findAgeDifference(age);
		System.out.println("Difference between the ages in the given list "+Arrays.toString(age)+" is: "+difference);


	}

}

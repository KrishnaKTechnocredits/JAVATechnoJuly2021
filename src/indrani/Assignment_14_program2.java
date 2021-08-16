package indrani;

public class Assignment_14_program2 {
	
	int minOfArrayElement(int[] num) {
		int min = num[0];
		for(int index=0; index<num.length;index++) {
			if(num[index]<min)
				min = num[index];
		}
		return min;
	}
	public static void main(String[] args) {
		int[] input = {12,11,44,10,45,67,98};
		Assignment_14_program2 program2 = new Assignment_14_program2();
		int output=program2.minOfArrayElement(input);
		System.out.println("Minimum number from the array is : "+ output);
	}

}

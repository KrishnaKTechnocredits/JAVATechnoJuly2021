package indrani;

public class Assignment_14_program1 {
	
	int maxOfArrayElement(int[] num) {
		int max = num[0];
		for(int index=0; index<num.length;index++) {
			if(num[index]>max)
				max = num[index];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] input = {12,11,44,10,45,67,98};
		Assignment_14_program1 program1 = new Assignment_14_program1();
		int output=program1.maxOfArrayElement(input);
		System.out.println("Maximum number from the array is : "+ output);
	}

}

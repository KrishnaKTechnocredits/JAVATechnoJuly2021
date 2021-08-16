package indrani;

public class Assignment_14_program3 {
	
	int getDiffOfMaxMin(int[] num) {
		int min = num[0];
		int max = num[0];
		for(int index=0; index<num.length;index++) {
			if(num[index]<min)
				min = num[index];
			if(num[index]>max)
				max = num[index];
		}
		return (max-min);
	}
	public static void main(String[] args) {
		int[] input = {12,11,44,10,45,67,98};
		Assignment_14_program3 program3 = new Assignment_14_program3();
		int output=program3.getDiffOfMaxMin(input);
		System.out.println("Difference between maximum and minimum number from the array : "+output );
	}
}


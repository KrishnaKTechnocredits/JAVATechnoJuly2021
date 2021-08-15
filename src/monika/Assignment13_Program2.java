package monika;

public class Assignment13_Program2 {
	static int count;

	void getCountOfZero(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]==0) {
				count ++;
			}
		}
		System.out.println("The count of zero's in given array: " + count);
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		Assignment13_Program2 program2 = new Assignment13_Program2();
		program2.getCountOfZero(input);
	}
}

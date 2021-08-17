package dattaraj;

public class Assignment_13_P1 {
	static int count;

	void returnCount(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				count ++;
			}
		}
		System.out.println("positive numbers from given array: " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		Assignment_13_P1 p1 = new Assignment_13_P1();
		p1.returnCount(input);

	}

}

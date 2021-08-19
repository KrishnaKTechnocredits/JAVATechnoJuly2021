package dattaraj;

public class Assignment_13_P2 {
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
		// TODO Auto-generated method stub
		int[] input = {1,-11,0,0,55,0,-23,0};
		Assignment_13_P2 p2 = new Assignment_13_P2();
		p2.getCountOfZero(input);
	}

}

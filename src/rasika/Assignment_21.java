package rasika;

public class Assignment_21 {

	int getDifference(int[] input) {
		int max = input[0];
		int min = input[0];
		for(int index = 0; index < input.length; index++) {
			if(input[index] > max) {
				 max = input[index];
			}
			else
				 min = input[index];
		}
		return max - min;
	}
	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();
		int[] age = {10,34,38,68,72,95,6};
		System.out.println("The difference between oldest and youngest family member. "+ assignment_21.getDifference(age));
		
	}
}

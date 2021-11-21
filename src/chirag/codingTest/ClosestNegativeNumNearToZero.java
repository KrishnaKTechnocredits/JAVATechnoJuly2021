package chirag.codingTest;

public class ClosestNegativeNumNearToZero {
	
	public void getClosestNegativeNumNearToZero(int [] input) {
		int closestNum = input[0];
		for(int index = 0 ; index < input.length ; index ++) {
			if(input[index] < 0) {
				if(closestNum < input[index])
					closestNum = input[index];
			}
		}
		System.out.println("Closest negative number near to zero : "+closestNum);
	}
	
	public static void main(String[] args) {
		int [] arr = {-3, 11, 123, -11, -9, -55, 33, 44};
		ClosestNegativeNumNearToZero closestNegativeNumNearToZero = new ClosestNegativeNumNearToZero();
		closestNegativeNumNearToZero.getClosestNegativeNumNearToZero(arr);
	}

}

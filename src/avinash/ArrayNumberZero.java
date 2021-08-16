package avinash;

public class ArrayNumberZero {
	
	int numberofZero(int[] input) {
		int count = 0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==0)
				count++;			
		}	
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNumberZero arraynumberzero = new ArrayNumberZero();
		int[] input = {1,-11,0,0,55,0,-23,0};
		System.out.println("number of zero's in given array:"+arraynumberzero.numberofZero(input));
		

	}

}

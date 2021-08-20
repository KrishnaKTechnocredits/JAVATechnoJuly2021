package genius;

public class Countnoofzeroingivenarray {

	int getCountNoOfZeroInGivenArray() {
		int count=0;
		int[] input = {1,-11,0,0,55,0,-23,0};
		for(int index=0;index<input.length;index++) {
			if(input[index]==0)
				count++;
		}
		System.out.println("Count of zero in given Array is " +count );
		return count;
	}
	public static void main(String[] args) {
		Countnoofzeroingivenarray countnoofzeroingivenarray = new Countnoofzeroingivenarray();
		System.out.println(countnoofzeroingivenarray.getCountNoOfZeroInGivenArray());

	}

}

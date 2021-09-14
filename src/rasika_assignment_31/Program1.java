package rasika_assignment_31;

public class Program1{
	void getTriplets(int[] input) {
		for(int index=0; index < input.length-2; index++) {
			if(input[index]==input[index+1]-1 && input[index+1]==input[index+2]-1) {
				System.out.println(input[index] +" " +input[index+1] +" "+ input[index+2]);
			}
		}
	}
	
	public static void main(String[] args) {
		Program1 pgm = new Program1();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		pgm.getTriplets(arr);
	}
}

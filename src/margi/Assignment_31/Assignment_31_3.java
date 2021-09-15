package margi.Assignment_31;

public class Assignment_31_3 {
	
	//count triplets of consecutive numbers
	int countTriplets(int[] input) {
		int count=0;
		int num;
		for(int index=0; index<input.length-2; index++) {
			num=input[index];
			if((num+1)==input[index+1]) {
				if((num+2)==input[index+2]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment_31_3 assignment_31_3 = new Assignment_31_3();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		System.out.println("Total triplets: "+ assignment_31_3.countTriplets(arr));
	}
}

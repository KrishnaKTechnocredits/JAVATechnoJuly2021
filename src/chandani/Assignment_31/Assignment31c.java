package chandani.Assignment_31;

public class Assignment31c {
	
	void getSequentialTriplets(int[] input) {
		
		int count = 0;
		int num;
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index];
			if(num+1 == input[index+1]) {
				if(num+2 == input[index+2]) {
					count++;
					System.out.println("Triplet numbers in sequential order : " + input[index] + ","
					+ input[index +1] + "," + input[index + 2]);
				}
			}
		}
		System.out.println("Count of sequential triplets " + count);
	}
	
	public static void main(String[] args) {
		Assignment31c assignment31c = new Assignment31c();
		int [] arr = {10,23,24,25,26,61,62,64,65,66};
		assignment31c.getSequentialTriplets(arr);
	}

}

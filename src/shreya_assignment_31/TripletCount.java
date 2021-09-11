package shreya_assignment_31;

public class TripletCount {
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
		TripletCount tripletCount=new TripletCount();
		int[] input={10,23,24,25,26,61,62,64,65,66};
		System.out.println("Triplet count: "+tripletCount.countTriplets(input));

	}

}

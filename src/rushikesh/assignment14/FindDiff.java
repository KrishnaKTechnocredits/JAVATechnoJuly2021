package rushikesh.assignment14;

public class FindDiff {
	int findDiff(int[] input) {	
		int maxNum=input[0];
		int minNum=input[1];

		for(int index=0;index<input.length;index++) {
			if(input[index]>maxNum) {
				maxNum=input[index];
			}
			if(input[index]<minNum) {
				minNum=input[index];
			}
		}
		return maxNum-minNum;
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		FindDiff findDiff= new FindDiff();
		int diff=findDiff.findDiff(input);
		System.out.println(diff);
	}
}

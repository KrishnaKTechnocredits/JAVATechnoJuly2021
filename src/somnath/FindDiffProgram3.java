package somnath;
public class FindDiffProgram3 {
	int findDiff(int[] input) {	
		int maxNum=input[0];
		int minNum=input[0];

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
		FindDiffProgram3 findDiff= new FindDiffProgram3();
		int diff=findDiff.findDiff(input);
		System.out.println("~~~~~~~~~~~****~~~~~~~~~");
		System.out.println("Difference between Max & mini number is ");
		System.out.println(diff);
		System.out.println("~~~~~~~~~~~****~~~~~~~~~");
	}
}
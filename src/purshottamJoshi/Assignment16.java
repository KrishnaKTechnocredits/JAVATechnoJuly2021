package purshottamJoshi;

class Assignment16 {
	int getVisibleTrees(int[] input) {
		int count=0;
		int output=0;
		for(int index=0; index < input.length; index++){
			if(input[index] > output){
				count++;
				output = input[index];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment16 assignment16= new Assignment16();
		int[] treeHeights = {1,3,5,5,5,11,9,10,15,14};
		System.out.println("Total visible trees are : "+assignment16.getVisibleTrees(treeHeights));
	}
}
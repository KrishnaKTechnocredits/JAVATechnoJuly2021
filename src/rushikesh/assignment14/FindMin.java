package rushikesh.assignment14;

public class FindMin {
	int getMinNum(int[] input) {
		int minNum=input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]<minNum) {
				minNum=input[index];
			}
			
		}
		return minNum;
		
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		FindMin findMin=new FindMin();
		int min=findMin.getMinNum(input);
		System.out.println("Minimum Number is");
		System.out.println(min);
	}
}

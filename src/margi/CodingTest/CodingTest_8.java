package margi.CodingTest;

public class CodingTest_8 {
	
	//How many pairs can be created from below sock size array
	int getPairOfSocks(int[] input) {
		int socks, countPair = 0;
		int num;
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
				num = input[index];
				socks=0;
				for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
					if(input[innerIndex]==num) {
						input[innerIndex] = 0;
						socks++;
					}
				}
				if(socks>1) {
					socks = socks/2;
					countPair += socks;
				}
			}
		}
		return countPair;
	}
	
	public static void main(String[] args) {
		CodingTest_8  codingTest_8 = new CodingTest_8();
		int arr[] = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println(codingTest_8.getPairOfSocks(arr));
	}
}

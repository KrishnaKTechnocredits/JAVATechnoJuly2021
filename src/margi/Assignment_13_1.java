package margi;

public class Assignment_13_1 {
	
	//return count of positive numbers from given array
	void setArray() {
		int[] num = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Total positive numbers: " + processData(num));
	}
	
	int processData(int[] positiveNum) {
		int count=0;
		for(int index=0; index < positiveNum.length; index++) {
			if(positiveNum[index] > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment_13_1 positiveCnt = new Assignment_13_1();
		positiveCnt.setArray();
	}
}

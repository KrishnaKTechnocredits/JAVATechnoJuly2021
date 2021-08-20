package margi;

public class Assignment_13_2 {

	//count number of 0
	void setArray() {
		int[] num = {1,-11,0,0,55,0,-23,0};
		System.out.println("Total number of 0: " + processData(num));
	}
	
	int processData(int[] zeroCnt) {
		int count=0;
		for(int index=0; index < zeroCnt.length; index++) {
			if(zeroCnt[index] == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment_13_2 totalZeroCnt = new Assignment_13_2();
		totalZeroCnt.setArray();
	}
}

package rushikesh.assignment13;

public class CountZero {
	int zeroCount=0;
	int[] input1 = {1,-11,0,0,55,0,-23,0};
	
	int processData1() {
		int ans=returnCountOfZero(input1);
		return ans;
	}
	
	int returnCountOfZero(int[] input1) {
		for(int index=0;index<input1.length;index++) {
			if(input1[index]==0) {
				zeroCount++;	
			}
		}
		return zeroCount;
	}
	
	public static void main(String[] args) {
		CountZero countZero=new CountZero();
		System.out.println("Zero Count is "+countZero.processData1());
	}
	
}

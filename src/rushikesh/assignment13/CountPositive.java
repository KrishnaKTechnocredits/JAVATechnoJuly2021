package rushikesh.assignment13;

public class CountPositive {
	int positiveCount=0;
	
	int[] input = {1,-11,-44,23,55,-99,-23,-22};
	
	int processData() {
		int ans=returnCountOfPositive(input);
		return ans;
	}
	
	int returnCountOfPositive(int[] input) {
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
				positiveCount++;	
			}
		}
		return positiveCount;
	}
	
	public static void main(String[] args) {
		CountPositive countPositive=new CountPositive();
		System.out.println("Positive Nums are "+countPositive.processData());
		
		
	}
}

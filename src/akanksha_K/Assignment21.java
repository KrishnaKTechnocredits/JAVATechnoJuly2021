package akanksha_K;

public class Assignment21 {
	
	int getoldestage(int[] input) {
		int oldest= 0;
		for (int index=0;index<input.length; index++) {
			if(input[index]>oldest) {
				oldest = input[index];
			}
		}
		return oldest;
	}
	
	int getyoungestage(int[] input) {
		int youngest= input[0];
		for (int index=0;index<input.length; index++) {
			if(input[index]<youngest) {
				youngest = input[index];
			}
		}
		return youngest;
	}	
	
	int getOldYoungDiff(int[] num) {
		int youngest  = num[0];
		int oldest =0;
		for (int index=0; index<num.length; index++) {
			if (num[index]<youngest)
				youngest =num[index];
			if (num[index]>oldest)
				oldest = num[index];
		}
		return oldest - youngest;
	}
	
	public static void main(String args[]) {
		int[] age = {10,34,38,68,72,95,6};
		Assignment21 assignment21 = new Assignment21();
		
		assignment21.getOldYoungDiff(age);
		System.out.println("Difference between old age and young age is: " + assignment21.getOldYoungDiff(age));
	}
}

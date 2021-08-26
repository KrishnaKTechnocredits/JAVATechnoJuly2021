package margi.Assignment_21;

public class Assignment_21 {
	
	//difference between oldest and youngest family member
	int processData(int[] age) {
		int min=age[0];
		int max=age[0];
		for(int index = 0; index < age.length; index++) {
			if(min>age[index]) 
				min=age[index];
			
			if(max<age[index])
				max=age[index];
		}
		return max-min;
	}
			
	void ageDiff() {
		int[] age = {10,34,38,68,72,95,6};
		System.out.println("Difference between oldest and youngest family member is " + processData(age));
	}
			
	public static void main(String[] args) {
		Assignment_21 diff = new Assignment_21();
		diff.ageDiff();
	}
}

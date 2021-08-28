package dattaraj;

public class Assignment_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {10,34,38,68,72,95,6};
		Assignment_21 assign_21 = new Assignment_21();
		int diff = assign_21.getYoungOldDiff(age);
		System.out.println("Difference between old & young age is :"+diff);
	}

	int getYoungOldDiff(int[] age) {
		// TODO Auto-generated method stub
		int maxAge =age[0];
		int minAge=age[0];
		
		for(int i=0;i<age.length;i++) {
			if(age[i]>maxAge) {
				maxAge=age[i];
			}
			if(age[i]<minAge) {
				minAge=age[i];
			}
		}
		return maxAge-minAge;
	}

}

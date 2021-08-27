package ashit;
public class Assignment21 {
	int getDiffOfAge(int[] input) {
		int maxAge=0;
		int minAge=input[0];
		for(int index=0;index<input.length;index++) {
		if(input[index]>maxAge) {
			maxAge=input[index];
		}
		if(input[index]<minAge) {
			minAge=input[index];
		}
		}
		return maxAge -minAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {10,34,38,68,72,95,6};
		Assignment21 assignment21 = new Assignment21();
		int output= assignment21.getDiffOfAge(age);
		System.out.println("The difference between oldest and youngest family member is "+output);
	}


}
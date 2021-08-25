package purshottamJoshi;

class Assignment21{

	int ageDifference() {
		
		int maxAge=0;
		int[] age = {10,34,38,68,72,95,6};
		int minAge = age[0];
		
		for(int index=0; index<age.length; index++) {
			if(age[index] > maxAge) {
				maxAge=age[index];
			}
			if(age[index] < minAge) {
				minAge = age[index];
			}
		}
			
		int ageDifference = maxAge - minAge;
		return ageDifference;
	}

	public static void main(String[] args){
		Assignment21 assignment21 = new Assignment21();
		System.out.println("difference between youngest and oldest family member : "+assignment21.ageDifference());

	}
}

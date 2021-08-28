package anuja;

class Assignment_21 {

	int getMaxAge(int[] age){
		int maxage=age[0];
		for(int i=1;i<age.length;i++) {
			if(maxage<age[i])
				maxage=age[i];
		}
		return maxage;
	}

	int getMinAge(int[] age){
		int minage=age[0];
		for(int i=1;i<age.length;i++) {
			if(minage>age[i])
				minage=age[i];
		}
		return minage;
	}

	public static void main(String[] args){
		Assignment_21 assignment_21=new Assignment_21();
		int[] age={10,34,38,68,72,95,6};
		System.out.println("Difference between eldest and youngest family member age is "+ (assignment_21.getMaxAge(age)-assignment_21.getMinAge(age)));
	}
}
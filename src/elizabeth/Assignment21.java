package elizabeth;

class Assignment21{
	
	int getAgeDiff(int[] age){
		int minAge=age[0];
		int maxAge=age[0];
		int diff=0;
		for(int index=0;index<age.length;index++){
			if(maxAge<age[index]){
				maxAge=age[index];
			}
			
			if(minAge>age[index]){
				minAge=age[index];
			}
			diff=maxAge-minAge;
		}
		return diff;
	}

	public static void main(String[] args){
		Assignment21 assignment21=new Assignment21();
		int[] age={10,34,38,68,72,95,6};
		System.out.println("Difference between maxAge and minAge is :");
		System.out.println(assignment21.getAgeDiff(age));
	}
}
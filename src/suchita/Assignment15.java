package suchita;

class Assignment15 {

	int getDifferenceOfLengthSum(String[] arr) {
		int lengthSum=0;
		int evenSum=0, oddSum=0;
		
		for(int index=0;index<arr.length;index++) {
			//lengthSum += arr[index].length();
		
		if((arr[index].length()) % 2 == 0 )
			evenSum += arr[index].length();
		else
			oddSum += arr[index].length();
		}
		//diffLength = evenSum - oddSum;
		return (evenSum-oddSum);
		
	}
	
	void processData() {
		String[] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		
		int diff =getDifferenceOfLengthSum(arr);
		System.out.println("Difference of even and odd count of given names :: "  + diff);
		
	}
	
	public static void main(String[] args) {
		//String[] arr = new String[4];
		Assignment15 assignment = new Assignment15();
		assignment.processData();
	//	System.out.println("Difference of even and odd count of given names :: " );
		//assignment.getDifferenceOfLengthSum(arr);
	}
}
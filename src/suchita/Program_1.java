package suchita;

 class Program_1 {
	
	int countOfPositiveNumbers(int[] number) {
		int count = 0;
		int num[]=number;
		for(int index=0;index<num.length;index++){
			if(num[index] > 0)
			
			count++;
		}
		return(count);
	}
	
	public static void main(String[] args) {
		Program_1 assignment = new Program_1();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("\n Count of positive numbers in the given range :: " + assignment.countOfPositiveNumbers(input));
	}
}


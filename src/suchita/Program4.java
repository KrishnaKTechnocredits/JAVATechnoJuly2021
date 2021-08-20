package suchita;

 class Program4 {
	 
	 int getDifferenceOddEven(int[] num) {
			int maxEven=0;
			int maxOdd=0;
			int diff=0;
			//num=number;
			
			for(int index=0;index<num.length;index++) {
				if(num[index] % 2 == 0){
					if(num[index] > maxEven)
						maxEven = num[index];
				}else if(num[index] > maxOdd)
					maxOdd =num[index];
			
			}
		diff = maxOdd - maxEven;
		
			return diff; 
		}
	 
	 public static void main(String[] args) {
			
			Program4 assignment = new Program4();
			int[] input = {1,11,44,23,55,99,23};
			System.out.println("\n Difference between maxEven and maxOdd from given array :: " + assignment.getDifferenceOddEven(input));
	 }

}

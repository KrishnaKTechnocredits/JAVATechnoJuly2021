package suchita;

 class Program1 {
	 int getMaxNumber(int[] num) {
			int max=0;
			for(int index=0;index<num.length;index++){
				if(num[index] > max)
					max = num[index];
				
			}
			return max;
			}
	 
	 public static void main(String[] args) {
			
			Program1 assignment = new Program1();
			int[] input = {1,11,44,23,55,99,23};
			System.out.println(" \n Maximum number from given array :: " + assignment.getMaxNumber(input));
	 }
}

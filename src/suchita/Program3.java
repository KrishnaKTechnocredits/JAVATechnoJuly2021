package suchita;

 class Program3 {
	 
	 int getDifference(int[] num) {
			int max=0;
			int min=num[0];
			int diff=0;
			//num=number;
			
			for(int index=0;index<num.length;index++){
				if(num[index] > max)
				max = num[index];
			
		}
		
			for(int index=0;index<num.length;index++){
				if(num[index] < min)
					min = num[index];
			}
			diff = max - min;
			return diff;
		}
	 
	 public static void main(String[] args) {
			
			Program3 assignment = new Program3();
			int[] input = {1,11,44,23,55,99,23};
			System.out.println("\n Difference between maximum and minium number from given array :: " + assignment.getDifference(input));
	 }

}

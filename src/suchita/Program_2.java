package suchita;

 class Program_2 {

	 int countOfZeros(int[] number) {
			int count = 0;
			int num[]=number;
			for(int index=0;index<num.length;index++){
				if(num[index] == 0)
				count++;
				
			}
			return count;
		}
		
	 public static void main(String[] args) {
		 Program_2 assignment = new Program_2();
		 int[] input1 = {1,-11,0,0,55,0,-23,0};
			System.out.println("\n Count of zeros in the given range :: " +assignment.countOfZeros(input1));
	 }
}

package priti;

class Assingment_14_3{
		
	int[] diffMaxMin = {1,11,44,23,55,99,23};
	
	int getDiffOfMaxandMinNumofArray(int []input){
		int maxNum = 0;
		int minNum = 1;
		for (int index= 0; index<input.length; index++){
			if (maxNum<input[index]){
				maxNum= input[index];
			}
		}	
		
		for (int index= 0; index<input.length; index++){
			if (minNum>input[index]){
				minNum = input[index];
			}
			
		}	
			
		System.out.println("max number is = " + maxNum);
		System.out.println("minimum number is = " + minNum);
		return maxNum-minNum;
	}
	
	public static void main(String[] a){
		Assingment_14_3 assingment_14_3 = new Assingment_14_3();
		System.out.println ("Difference of maximun number and minimum number is = " +assingment_14_3.getDiffOfMaxandMinNumofArray(assingment_14_3.diffMaxMin));
	}
}
		
	
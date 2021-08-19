package priti;

class Assingment_14_1{
	
	int[] input = {1,11,44,23,55,99,23};
			
	int getmaxNumber(int [] num){
		int maxNum=0;
		for (int index = 0; index<num.length; index++){
			if (maxNum < num[index]){
				maxNum = num [index];
			}			
		}return maxNum;
	}
		
	public static void main(String[] a){
		Assingment_14_1 assingment_14_1 = new Assingment_14_1();
		System.out.println("maximu number from given array is = "+ assingment_14_1.getmaxNumber(assingment_14_1.input));
	}
}	
	
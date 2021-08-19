package priti;

class Assingment_14_2{
	int[] mininput = {1,11,44,23,55,99,23};
	
	int getminimumNum(int[] number){
		int miniNum = 1;
		for (int index=0; index<number.length; index++){
			if (miniNum>number[index]){
				miniNum=number[index];
			}
		}return miniNum;
	}
	
	public static void main(String[] a){
		Assingment_14_2 assingment_14_2 = new Assingment_14_2();
		System.out.println("Minimum number from given array is = " + assingment_14_2.getminimumNum(assingment_14_2.mininput));
	}
}	
	
	
	

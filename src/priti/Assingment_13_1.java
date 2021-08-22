package priti;

class Assingment_13_1{
		
	int getpostvNumCnt(int[] input){
		int postiveNumCnt=0;
		for (int index= 0 ; index<input.length; index++){
			if (input[index]>0){
				postiveNumCnt++;
			}
		}return postiveNumCnt;
	}
	
	
	public static void main(String[] a){
		Assingment_13_1 assingment_13_1 = new Assingment_13_1();
		int[] number = new int [8];
		number[0] = 1;	
		number[1] = -11;	
		number[2] = -44;
		number[3] = 23;
		number[4] = 55;
		number[5] = -99;
		number[6] = -23;
		number[7] = -22;
		System.out.println("Count of postive numbers from array is = "+ assingment_13_1.getpostvNumCnt(number));
	}	
}		
	
 
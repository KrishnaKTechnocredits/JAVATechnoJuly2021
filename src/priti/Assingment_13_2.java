package priti;

class Assingment_13_2{
	static int [] zeroNum ={1,-11,0,0,55,0,-23,0};
	
	int getZeroNumCnt(int[] input){
		int zeroNumCnt = 0;
		for(int index=0;index<input.length;index++){
			if(input[index]==0){
				zeroNumCnt++;
			}
		}return zeroNumCnt;
	}
		
	public static void main(String[] a){
		Assingment_13_2 assingment_13_2 = new Assingment_13_2();
		int zeroNumberCnt= assingment_13_2.getZeroNumCnt(Assingment_13_2.zeroNum);
		System.out.println("zero number count is = " +zeroNumberCnt);
	}
}
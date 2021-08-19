package priti;

class Assingment_13_3{
	int[] getNumbers(int num){
		int[] output = new int [5];
		for(int index=0;index<output.length; index++){
			num--;
			output[index]= num;
		}return output;
	}
	

	public static void main(String[] a){
		Assingment_13_3 assingment_13_3 = new Assingment_13_3();
		int[] ans = assingment_13_3.getNumbers(50);
		System.out.println("5 smaller numbers of the given number are = " +ans);
		
	}
} 
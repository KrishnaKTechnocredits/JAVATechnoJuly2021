package priti;

class Assingment_14_4{
	int[] diffMaxOddAndMaxEvenNum = {1,11,44,23,55,99,23,22};

	int getdiffBetMaxOddandMaxEvenNumfromArray(int[] input){
		int maxOddNum = 0;
		int maxEvenNum = 0;
		for (int index =0 ; index<input.length; index++){
			if (input[index]%2==0){
				if (maxEvenNum<input[index])
				maxEvenNum=input[index];
			}
		}
		for (int index =0 ; index<input.length; index++){
			if (input[index]%2!=0){
				if (maxOddNum<input[index])
				maxOddNum=input[index];
			}
		}
		System.out.println("maxEven number is = " + maxEvenNum);
		System.out.println("maxOdd  number is = " + maxOddNum);
		return maxOddNum-maxEvenNum;
	}	 
	
	public static void main(String[] a){
		Assingment_14_4 assingment_14_4 = new Assingment_14_4();
		System.out.println("Difference of Maxodd and MaxEven number is  = "+assingment_14_4.getdiffBetMaxOddandMaxEvenNumfromArray(assingment_14_4.diffMaxOddAndMaxEvenNum));
	}
}



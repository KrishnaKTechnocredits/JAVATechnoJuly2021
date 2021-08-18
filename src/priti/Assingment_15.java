package priti;

class Assingment_15 {

		int calLengthOfEle(String[] input){
		int sumEvenLenEle = 0;
		int SumOddLenEle = 0;
		
		for (int index=0;index<input.length; index++){
		  
			if (input[index].length()%2==0){
			sumEvenLenEle= sumEvenLenEle+input[index].length();
			}else{
			SumOddLenEle = SumOddLenEle+ input[index].length();
			}
		}
		return sumEvenLenEle - SumOddLenEle;
	}

	public static void main(String[] a){
	Assingment_15 assingment_15 = new Assingment_15();
	String[] names = new String[4];
	names[0] = "Maulik";	
	names[1] = "Techno";	
	names[2] = "Nidhi";	
	names[3] = "Ankit";
	//int diff = assingment_15.calLengthOfEle(names);	
	System.out.print("difference is : " +assingment_15.calLengthOfEle(names));
	}
}
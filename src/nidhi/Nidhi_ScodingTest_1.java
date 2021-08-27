package nidhi;

class Nidhi_ScodingTest_1{
	
	int stringSum(String[] str){
		int sum = 0;
		for(int i=0; i<str.length;i++){
			for (int j=0; j < str[i].length(); j++){
					if (Character.isDigit(str[i].charAt(j))){
					sum = sum + Character.getNumericValue(str[i].charAt(j)) ;
					}
				}
			}

		return sum;
	}
	
	public static void main(String[] ar){
		Nidhi_ScodingTest_1 test = new Nidhi_ScodingTest_1();
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println(test.stringSum(input));
	}

}

package prerana;

final class CodeTest_1 {
	
	void sumDigit() {
		String[] input= {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			
			
			for(int j=0;j<input[i].length();j++) {
				
				char c=input[i].charAt(j);
				
				if(Character.isDigit(c)) {
					sum= sum +Character.getNumericValue(c);
				}
			}
		}
		
		System.out.println("Total digit sum in whole string are: "+sum);
	}
	

	
		public static void main(String[] args) {
			CodeTest_1 codet=new CodeTest_1();
			
			codet.sumDigit();
			
				
		}
}

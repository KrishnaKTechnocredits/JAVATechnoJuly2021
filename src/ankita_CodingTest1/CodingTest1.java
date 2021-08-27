package ankita_CodingTest1;

	public class CodingTest1 {
		
		int getsumOfDigit(String input) {
			int sum = 0;
			char ch ;
			for (int index=0; index<input.length();index++) {
				ch =  input.charAt(index);
				if (Character.isDigit(ch)) {
					int num= Character.getNumericValue(ch);
					sum=sum+num;
				}
		    }
			return sum;
		}
		int getStringsum(String[] input) {	
			int sum = 0;
			for (int index=0; index<input.length; index++) {
				int num = getsumOfDigit(input[index]);
				sum=sum+num;
			}
			return sum;
		}
		
		public static void main(String args[]) {
			CodingTest1 test = new CodingTest1(); 
			String[] input = {"t2e4c","2h7no","3h6h2h5","1mk3", "k9g8"};
			System.out.println("The sum of digits in given string is " +test.getStringsum(input));
		}	
}

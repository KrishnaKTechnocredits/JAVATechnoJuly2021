/* Program 1:
	String str = "te12ch33no3credit4s"; 
	output = 12+33+3+4

	Program2:
	String str = "Ma1U2liK"
	output : MUK12ali
	*/	
package harshada.Assignment_25;

public class Assignment_25_1 {
	
		void getDigitsSum(String str) {
			String tempDigitChar="0";
			int sum=0;
			for(int index=0; index<str.length(); index++) {
				Character ch=str.charAt(index);
				if(Character.isDigit(ch) ) {
					//digit=Character.getNumericValue(str.charAt(index));
					tempDigitChar=tempDigitChar+ch;	
				}
				else {
						sum=sum+Integer.parseInt(tempDigitChar);
						tempDigitChar="0";
				}
			}
			
			System.out.println("Output= "+ sum);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assignment_25_1 assignment_25_1 =new Assignment_25_1 ();
			assignment_25_1.getDigitsSum("te12ch33no3credit4s"); 
		}
}

/* Assignmrnt25:-program1-String str="te12ch33no3credit4s
Output:-12+33+3+4=52*/
package santosh;
public class Assignment25_1 {

		void getDigitsSum(String str) {
			String tempDigitChar="0";
			int sum=0;
			for(int index=0; index<str.length(); index++) {
				Character ch=str.charAt(index);
				if(Character.isDigit(ch) ) {
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
			Assignment25_1 assignment25_1 =new Assignment25_1 ();
			assignment25_1.getDigitsSum("te12ch33no3credit4s"); 
		}
}
 

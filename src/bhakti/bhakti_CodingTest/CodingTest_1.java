/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.

Timing : 7:45 am to 8:30 am
{"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};

All the best.
Branch name : yourName_ScodingTest_1*/


package bhakti_CodingTest;


public class CodingTest_1 {
	int sum =0;
	
	void getSumOFDigit() {
		 
		String input[]= {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		int finalSum=0;
		for (int index=0; index < input.length ; index++){
			finalSum=finalSum+ findSumOFDigit(input[index]);
			
		}
		System.out.println("Total sum of digit "+finalSum);
		
	}

	int findSumOFDigit(String str) {
		int sum=0;
		for (int index=0; index< str.length(); index++) {
			
			if (Character.isDigit(str.charAt(index))) 
		 		 sum+=Character.getNumericValue(str.charAt(index));	 
		}
		return sum;
	}
		
		 
	 public static void main(String [] hjhj) {
		 
		 CodingTest_1 codingTest_1= new CodingTest_1();
		 codingTest_1.getSumOFDigit();
		 
	 }	

}

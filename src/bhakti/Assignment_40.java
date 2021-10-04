/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/

package bhakti;

public class Assignment_40 {
	void findNumberFromString(String str) {
		String [] input= str.split(" ");
		for (int i=0; i < input.length; i++) {
			try {
				int s= Integer.parseInt(input[i]);
				System.out.println(s);
			}catch(NumberFormatException ae) {
				
			}
		}
	}
	
	//when decimal 
	
	void findDecimalNumberFromString(String str) {
		String [] input= str.split(" ");
	 
		for (int i=0; i < input.length; i++) {
			try {
				double s= Double.parseDouble(input[i]);
				System.out.println(s);
			}catch(NumberFormatException ae) {
				
			}
		}
	}
	public static void main(String[] args) {
		String str= "I have 15 years and 9 months of exp";
		String str1= "I have 15.4 years and 9.2 months of exp";
		Assignment_40 a= new Assignment_40();
		a.findDecimalNumberFromString(str1);
		a.findNumberFromString(str);
	}

}

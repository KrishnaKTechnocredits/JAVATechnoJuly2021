package nidhi;

/**
Test - 6 : 10th Sep'2021
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno
**/

class CodingTest_6{

	void firstNonRepeating(String str){
		for (int i=0;i<str.length();i++){
			if ( str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println("First non-repeating character is : " + str.charAt(i));
				break;
			}
		}
		
	}
	
	String firstNonRepeatingWord(String str){
		String[] output = str.split(" ");
		
		for (int i =0;i < output.length;i++) {
			int cnt=0;
			
			for (int j=i+1;j<output.length;j++) {
				if (output[i].equals(output[j]))
					cnt++;				
				}
			
			if (cnt ==0)
				return output[i];
		}
		return null;
	}
	
	public static void main(String[] arg){
		CodingTest_6 codingtest= new CodingTest_6();
		String Str1 = "technocredits";
		codingtest.firstNonRepeating(Str1);
		String Str2 = "hi this is techno gm credits this hi is";
		System.out.println("First Non repeating word : " + codingtest.firstNonRepeatingWord(Str2));
	}
}
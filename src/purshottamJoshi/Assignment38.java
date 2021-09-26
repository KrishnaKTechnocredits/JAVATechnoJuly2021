/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
package purshottamJoshi;

class Assignment38{


	void getSubString(String input1,String input2, String input3){

		int firstHi =input1.indexOf(input2);
		int secondHi =input1.indexOf(input2, firstHi+1);
		int firstIndexGlobant=input1.indexOf("Globant");
		int globantLength= input3.length();
		String output=input1.substring(secondHi, firstIndexGlobant+globantLength);
		System.out.println(output);
	}

	public static void main(String[] args){
		String str1 = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String str2 ="Hi";
		String str3 ="Globant";
		new Assignment38().getSubString(str1,str2,str3);
		
	}
}
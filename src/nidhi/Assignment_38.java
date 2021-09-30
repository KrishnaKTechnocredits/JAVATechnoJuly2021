package nidhi;

/**Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
**/

class Assignment_38{
	
	String getString(String str, String fStr, String lStr){
		String output="";
		int hiInt = str.lastIndexOf("Hi");
		int gloInt = str.indexOf("Globant") + lStr.length();
		
		output = str.substring(hiInt,gloInt);
		return output;
	}
	
	public static void main(String[] arg){
		Assignment_38 assignment = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println(assignment.getString(str, "Hi", "Globant"));
		
	}
}


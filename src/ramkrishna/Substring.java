package ramkrishna;

public class Substring {

	String getSubstring(String str){
 		String output=" ";
 		for(int index=0;index<str.length();index++){
 			output=str.substring(str.lastIndexOf("Hi"),str.indexOf("Aashvi"));
 		}
 		return output;
 	}

 	public static void main(String[] args){
 		Substring substring= new Substring();
 		System.out.println(substring.getSubstring("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant"));
 	}

 }


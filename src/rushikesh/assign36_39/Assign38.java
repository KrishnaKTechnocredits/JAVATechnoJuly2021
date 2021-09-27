package rushikesh.assign36_39;
/*
 Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
 */
public class Assign38 {
	String getLastHiToFirstGlobant(String str) {
		String S=str.substring(str.lastIndexOf("Hi"),str.indexOf("Globant")+"Globant".length());
		return S;	
	}

	public static void main(String[] args) {
		Assign38 assign38=new Assign38();
		String Str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String OP=assign38.getLastHiToFirstGlobant(Str);
		System.out.println(OP);
	}
}

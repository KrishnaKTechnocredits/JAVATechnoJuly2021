package pritiString_programmes;

import java.util.Arrays;

public class Assingment_26_2 {
	String getString(String input) {
		String output="";
		for (int index=0;index<input.length();index++){
			output= output+input.charAt(index);
		}//System.out.println(output);
		return output;
	}
	
	String[] getWholeStringReverse(String[] str) {
		String[] outstr= new String[str.length];
		int cnt=0;
		for (int index=str.length-1;index>=0;index--) {
			outstr[cnt] = getString(str[index]);
			cnt++;
		}
		return outstr;
	}
		
	public static void main(String[] a) {
		Assingment_26_2 assingment_26_2 = new Assingment_26_2();
		String []input = {"Credits", "Techno","From","Diwali","Happy"};
		//assingment_26_2.getreverString("Credits");
		System.out.println("output:" +Arrays.toString(assingment_26_2.getWholeStringReverse(input)));
	}
}
/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

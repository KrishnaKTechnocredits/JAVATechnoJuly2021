package pritiString_programmes;

import java.util.Arrays;

public class Assingment_26_1 {
	
	String reverseString(String inputstr) {
		String outputstr= "";
		for (int index=inputstr.length()-1; index>=0;index--) {
			outputstr = outputstr+inputstr.charAt(index);
			
		}//System.out.println(outputstr);
		return outputstr;
	}
	
	String[] reversWholeString(String[] inputWholeString) {
		String[] output= new String[inputWholeString.length];
		int cnt=0;
		for (int index=inputWholeString.length-1;index>=0;index--) {
			output[cnt] = reverseString(inputWholeString[index]);
			cnt++;
		}return output;
	}
	
	public static void main(String[] a) {
		Assingment_26_1 assingment_26_1 = new Assingment_26_1();
		String inputstr = "This is technocredits";
		String[] input= inputstr.split(" ");
		//assingment_26_1.reverseString(inputstr);
		System.out.println(Arrays.toString(assingment_26_1.reversWholeString(input)));
	}

}
/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT */ 

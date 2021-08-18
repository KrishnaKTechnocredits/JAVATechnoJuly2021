package bhakti;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignmet_17_reversearray {
	
	void getReverseArry(String srt1) {
		String  reverse= "";
		
		System.out.println("Provided string : "+srt1);
		for (int index=(srt1.length()-1); index>=0; index--) {
			reverse= reverse + srt1.charAt(index);
		}
		
		System.out.println("Reverse string :  " + reverse);	
		System.out.println("--------------------- " );	
		
	}
	
	public static void main(String[] g) {
		String arr= "Swarnim";
		String arr1="technocredits";
		
		Assignmet_17_reversearray assignmet_17_reversearray= new Assignmet_17_reversearray();
		assignmet_17_reversearray.getReverseArry(arr);
		assignmet_17_reversearray.getReverseArry(arr1);
	}

}

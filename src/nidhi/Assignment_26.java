package nidhi;

import java.util.Arrays;

class Assignment_26{
	
	String reverseString(String str){
		String revStr="";
		for (int i= str.length()-1;i >=0;i--){
			revStr = revStr + str.charAt(i);
		}
		return revStr;
	}
	
	String reverseString(String[] strArr){
		String[] revStr = new String[strArr.length];
		for (int i= strArr.length-1;i >=0;i--){
				revStr[strArr.length-1 - i] = strArr[i];
			
		}
		return Arrays.toString(revStr);
	}
	
	void swapNumber(int firstnum, int secondnum){
		int varswap=0;
		varswap = firstnum;
		firstnum = secondnum;
		secondnum = varswap;
		System.out.println("Output after reversing the numbers : " + firstnum + " , " + secondnum);
		
	}
	
	void swapNumberNoExtraVar(int firstnum, int secondnum){
		firstnum = firstnum - secondnum;
		secondnum = firstnum + secondnum;
		firstnum = secondnum - firstnum;
		System.out.println("Output after reversing the numbers : " +firstnum + " , " + secondnum);
	}
	
	public static void main(String[] arg){
		Assignment_26 assignment26= new Assignment_26();
		String str = "This is Technocredits";
		System.out.println("Original String : " + str );
		System.out.println("Reversed String : " + assignment26.reverseString(str));
		String[] strArr = {"credits","Techno","from","Diwali","Happy"};
		System.out.println(assignment26.reverseString(strArr));
		assignment26.swapNumber(56,12);
		assignment26.swapNumberNoExtraVar(56,12);
	}
	
	
	
	
}
/*	Program 1: Write a method to reverse a given number.
input : 1932
output : 2391
 */

package arti_K.Assignment_30;

public class NumberReverse {
	
	int reverseNum(int no){
	
		int revNum = 0;
		
		while(no > 0){
			int remainder = no % 10;
			revNum = revNum * 10 + remainder;
			no = no/10;
		}
		return revNum;
	}
	
	int reverse(int num){
		String str = Integer.toString(num);
		String revStr = "";
			for(int index = str.length()-1; index >=0; index--) {
				revStr = revStr + str.charAt(index);
			}
		int revNum = Integer.parseInt(revStr);
		return revNum;
	}
	
	public static void main(String[] args){
		int number = 1932;
		int reversenum = new NumberReverse().reverseNum(number);
		System.out.println("Reverse number of "+number+" is "+reversenum);
		
		int reversenum1 = new NumberReverse().reverse(number);
		System.out.println("Reverse number of "+number+" is "+reversenum1);
	}

}

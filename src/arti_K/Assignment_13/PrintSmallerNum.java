/*program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45
 */

package arti_K.Assignment_13;

public class PrintSmallerNum {
	int count;
	
	int[] printSmallerNum(int num) {
		int[] smallnumber = new int[5] ;
		int smallnumbercount = 0;
		
		for(int index = num; index <= num ; index--) {
			if(index < num) {
				smallnumber[smallnumbercount] = index;
				smallnumbercount++;
				count++;
			}
			if(count == 5)
				break;
		}
		return smallnumber;
	}
	
	public static void main(String[] args) {
		PrintSmallerNum printsmallernum = new PrintSmallerNum();
		int[] number = printsmallernum.printSmallerNum(50);
		System.out.println("5 smaller numbers of the given number are 50 : "
				);
		for(int index = 0; index < number.length; index++) {
			System.out.println(number[index]);
		}
	}
}

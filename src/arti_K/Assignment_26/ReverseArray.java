/* Assignment - 26 : 1st Sep'2021  Program : 2 

reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/

package arti_K.Assignment_26;

public class ReverseArray {
	
	String[] revarray(String[] arr) {
		String[] op = new String[arr.length];
		int count =0;
		for(int index = arr.length-1; index >= 0; index--) {
			op[count] = arr[index];
			count++;
		}
		return op;
	}
	
	public static void main(String[] args) {
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseArray reversearray = new ReverseArray();
		String[] temp = reversearray.revarray(input);
		
		System.out.println("Reverse Array : ");
		for(int index = 0; index < temp.length; index++) {
			System.out.print(temp[index]+" ");
		}
	}
}

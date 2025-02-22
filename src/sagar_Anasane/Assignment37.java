/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family
*/package sagar_Anasane;

import java.util.Arrays;

public class Assignment37 {
	void findLargestWord(String inp,int n) {
		String[] str= inp.split(" ");
		Arrays.sort(str);
		//System.out.println(str);
		System.out.print("Sorted String Data : ");
		for(int index=0;index<str.length;index++) {
			System.out.print(str[index]+" ");
		}
		System.out.println("\n"+"Second Largest Word :"+str[n-1]);
	}
	public static void main(String[] args) {
		String input="Welcome to the family";
		int num=2;
		Assignment37 assignment37=new Assignment37();
		assignment37.findLargestWord(input,num);
	}
}

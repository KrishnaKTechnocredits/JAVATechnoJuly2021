package rushikesh.assign26;

import java.util.Arrays;

public class Assign26_2 {
	void getRevArray(String[] input) {
		String[] arr=new String[input.length];
		int count = 0;
		for(int index=input.length-1;index>=0;index--) {
			arr[count]=input[index];
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Assign26_2 assign26_2= new Assign26_2();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		assign26_2.getRevArray(input);
	}
}

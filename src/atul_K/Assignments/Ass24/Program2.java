/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
package atul_K.Assignments.Ass24;

public class Program2 {

	void getMaxRepeatWordWithFreq(String str) {
		int max =0;
		String word = null;
		String[] arr = str.split(" ");
		for(int index =0;index<arr.length;index++) {
			int cnt = 0;
			if (arr[index].indexOf(arr[index]) == index) {
				for(int ind=index;ind< arr.length;ind++) {
					if (arr[index].equals(arr[ind]))
						cnt++;
				}
			}
			if (max < cnt) {
				max = cnt;
				word = arr[index];
			}
		}
		System.out.println("Max Repeating word is "+ word +" with frequency of "+max);
	}
	
	public static void main (String[] args) {
		String str = "Hi Hello Hi Techno Hello Hi";
		Program2 p2 = new Program2();
		p2.getMaxRepeatWordWithFreq(str);
	}
}

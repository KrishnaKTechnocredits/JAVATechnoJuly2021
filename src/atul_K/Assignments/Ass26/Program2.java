/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package atul_K.Assignments.Ass26;

public class Program2 {
	String[] revStringArr(String[] arr) {
		String[] target = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			target[arr.length-1-index]=arr[index];
		}
		return target;
	}
	
	void display(String[] arr) {
		for(int index =0; index < arr.length;index++) {
			System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		String[] arr = {"Credits", "Techno","From","Diwali","Happy"};
		Program2 p2 = new Program2();
		p2.display(p2.revStringArr(arr));
	}
}

package atul_K.Assignments.Ass15;

public class Program2 {
	char[] midchar(String[] arr) {
		char[] ch = new char[arr.length];
		for(int index =0;index < arr.length; index++) {
			ch[index] = arr[index].charAt(arr[index].length()/2);
		}
		return ch;
	}
	public static void main(String[] args) {
		String [] arr = {"hello","Techno","credits"};
		Program2 p2 = new Program2();
		System.out.println(p2.midchar(arr));
	}
	
}

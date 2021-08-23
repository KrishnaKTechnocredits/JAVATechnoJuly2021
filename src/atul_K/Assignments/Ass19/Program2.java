package atul_K.Assignments.Ass19;

public class Program2 {
	String getWordWithMaxLen(String str) {
		String[] arr = str.split(" ");
		String out = "";
		for(int index =0;index<arr.length;index++) {
			if (out.length()<arr[index].length())
				out = arr[index];
		}
		return out;
	}
	void display(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		String input = "Good Morning Technocredits Hi Hello";
		Program2 program2= new Program2();
		String word = program2.getWordWithMaxLen(input);
		program2.display(word);
	}
}

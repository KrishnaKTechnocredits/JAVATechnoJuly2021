package atul_K.Assignments.Ass19;

public class Program3 {
	String getWordWithMinLen(String str) {
		String[] arr = str.split(" ");
		String out = arr[0];
		for(int index =0;index<arr.length;index++) {
			if (out.length()>arr[index].length())
				out = arr[index];
		}
		return out;
	}
	void display(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		String input = "Good Morning Technocredits Hi Hello";
		Program3 program3= new Program3();
		String word = program3.getWordWithMinLen(input);
		program3.display(word);
	}
}

package atul_K.Assignments.Ass19;

public class Program1 {
	String input = "Hi Techno Credits Hello";
	
	int countWord(String str) {
		int count;
		String[] arr = str.split(" ");
		count = arr.length;
		return count;
	}
	void display(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Program1 program1= new Program1();
		int temp = program1.countWord(program1.input);
		program1.display(temp);
	}
}

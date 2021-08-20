package indrani;

public class Assignment_19_program1 {
	int countOfWordsInString(String str) {

		String arr[] = str.split(" ");
		return arr.length;

	    }

	public static void main(String[] args) {
		
		Assignment_19_program1 program1 = new Assignment_19_program1();
		String str = "Hi Techno Credits Hello";
		int count = program1.countOfWordsInString(str);
		System.out.println("The number of words in the string \'" + str + "\' is: " + count);

	    }

}


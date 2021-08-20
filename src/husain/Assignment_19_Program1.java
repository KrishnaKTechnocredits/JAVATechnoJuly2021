package husain;

public class Assignment_19_Program1 {

	int countOfWordsInString(String str) {

		String arr[] = str.split(" ");
		return arr.length;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_Program1 obj = new Assignment_19_Program1();
		String str = "Hi Techno Credits Hello";
		int count = obj.countOfWordsInString(str);
		System.out.println("The number of words in the string \'" + str + "\' is: " + count);

	}

}

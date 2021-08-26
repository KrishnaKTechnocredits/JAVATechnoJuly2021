package priti;

public class Assingment_19_1 {
	
	void convertStringInToWord() {
		String statment = "Hi Techno Credits Hello";
		String [] str= statment.split(" "); 
		System.out.println("The number of words in the string are = " + str.length);
		for(int index= 0; index<str.length; index++) {
			System.out.println(str[index]+"-->"+ str[index].length());
		}
	}	
	
	public static void main(String[] a) {
		Assingment_19_1 assingment_19_1 = new Assingment_19_1();
		assingment_19_1.convertStringInToWord();
	}	
}	
	
	


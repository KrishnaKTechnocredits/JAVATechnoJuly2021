package indrani;

   public class Assignment_15_program2 {

	    char[] getMiddleCharFromArray(String[] str) {

		 char[] middleChar = new char[3];
		 for (int index = 0; index < str.length; index++) {
			int i = str[index].length() / 2;
			middleChar[index] = str[index].charAt(i);
			

		 }
		 return middleChar;
	     }

	     public static void main(String[] args) {

		 Assignment_15_program2 middleCharArray = new Assignment_15_program2();

		 System.out.println("Retrieve the middle characters of all elements of the Sring array");
		 String[] str = { "hello", "techno", "credits" };
		 System.out.println(middleCharArray.getMiddleCharFromArray(str));

	}
}
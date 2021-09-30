package ramkrishna;

public class Secondlargest {

	
	String getSecondLargest(String str) {
 		String strArray[] = str.split(" ");
 		String maxWord = "";
 		String secondMax = "";

 		for (int index = 0; index < strArray.length; index++) {
 			if (strArray[index].length() > maxWord.length()) {
 				secondMax = maxWord;
 				maxWord = strArray[index];
 			} else if (strArray[index].length() > secondMax.length())
 				secondMax = strArray[index];
 		}

 		return secondMax;
 	}
 	void displaySecondLargest(String str) {

 		System.out.println("Second largest word is: "+getSecondLargest(str));
 	}
 	public static void main(String[] args) {
 		Secondlargest secondLargest = new Secondlargest();
 		String str = "Welcome to the family";
 		secondLargest.displaySecondLargest(str);
 	}
 }


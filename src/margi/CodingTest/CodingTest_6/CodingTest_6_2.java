package margi.CodingTest.CodingTest_6;

public class CodingTest_6_2 {

	//first non repeating word 
	String getFirstWord(String input) {
		int count;
		String[] arr = input.split(" ");
		String firstWord = arr[0], temp;
		for(int index=0; index<arr.length; index++) {
			temp = arr[index];
			count=0;
			for(int innerIndex=0; innerIndex<arr.length; innerIndex++) {
				if(temp.equals(arr[innerIndex])) 
					count++;
			}
			if(count==1) {
				firstWord = temp;
				break;
			}
		}
		return firstWord;
	}
	public static void main(String[] args) {
		CodingTest_6_2 codingTest_6_2 = new CodingTest_6_2();
		String str = "hi this is techno gm credits this hi is";
		System.out.println("First non repeating word: " + codingTest_6_2.getFirstWord(str)); 
	}
}

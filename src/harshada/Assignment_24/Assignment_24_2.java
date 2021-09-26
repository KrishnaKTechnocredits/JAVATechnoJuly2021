/*
 Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
 */
package harshada.Assignment_24;

public class Assignment_24_2 {
	
	void getMaxRepeatingWord(String str) {
		String strArray[]= str.split(" ");
		
		int maxFreq=0;
		String maxRepeatingString="";
		for(int index=0; index< strArray.length; index++) {
			int maxCount=0;
			for (int innerIndex = 0; innerIndex < strArray.length;innerIndex++) {
				if(strArray[index].equals(strArray[innerIndex])) {
					maxCount++;
				}
			}
		
			if(maxCount>maxFreq) {
				maxFreq=maxCount;
				maxRepeatingString=strArray[index];
			}
	}
		System.out.println("Maximum Repeating String="+maxRepeatingString);
		System.out.println("Repeatation Frequency of above String is ="+ maxFreq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_24_2 assignment_24_2=new Assignment_24_2();
		assignment_24_2.getMaxRepeatingWord("Hi Hello Hi Techno Hello Hi Hi");
	}
}

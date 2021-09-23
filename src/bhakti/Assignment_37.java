/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package bhakti;

public class Assignment_37 {
	
	void tofindSecondLargestWord(String input) {
		String[] array1= input.split(" ");
		String firstLarge="";
		String sceondLarge="";
		for (int i=0; i<array1.length; i++) {
			if (array1[i].length() > sceondLarge.length()) {
				if (array1[i].length()<firstLarge.length()) 
					sceondLarge=array1[i];
				else {	
					sceondLarge=firstLarge;
					firstLarge=array1[i];
				}	
			}		
		}
		System.out.println(sceondLarge);			 
	}
    
	
	public static void main(String[] args) {
		String str="this Welcome to the Roayabost family";
		String str1="Welcome to the family";
		Assignment_37 a1= new Assignment_37();
		a1.tofindSecondLargestWord(str);
		a1.tofindSecondLargestWord(str1);
	}

}
